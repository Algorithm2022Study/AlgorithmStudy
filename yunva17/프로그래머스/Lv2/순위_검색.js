const solution = (info, query) => {
  let answer = [];
  let map = {};

  const combination = (infos, score, map, start) => {
    let key = infos.join('');
    let value = map[key];

    if (value) {
      map[key].push(score);
    } else {
      map[key] = [score];
    }
    // 조합 만들기
    for (let i = start; i < infos.length; i++) {
      let combiArr = [...infos];
      combiArr[i] = '-';

      combination(combiArr, score, map, i + 1);
    }
  };

  // 이분 탐색
  const binarySearch = (map, key, score) => {
    let scoreArr = map[key];

    if (scoreArr) {
      let start = 0;
      let end = scoreArr.length;

      while (start < end) {
        let mid = Math.floor((start + end) / 2);

        if (scoreArr[mid] >= score) {
          end = mid;
        } else if (scoreArr[mid] < score) {
          start = mid + 1;
        }
      }

      return scoreArr.length - start;
    } else return 0;
  };

  // -로 가능한 모든 조합 만들기
  for (let i = 0; i < info.length; i++) {
    let infos = info[i].split(' ');
    let score = infos.pop();

    combination(infos, score, map, 0);
  }

  // 이분탐색을 위해 정렬
  for (let key in map) {
    map[key].sort((a, b) => a - b);
  }

  for (let i = 0; i < query.length; i++) {
    let querys = query[i].replace(/ and /g, '').split(' ');
    let score = Number(querys.pop());

    answer.push(binarySearch(map, querys.join(''), score));
  }

  return answer;

  // 정확성  테스트 통과 / 효율성  테스트 실패
  //   let infoList = [];
  //   let queryList = [];
  //   let answer = [];

  //   info.forEach((item) => {
  //     let ilist = item.split(' ');
  //     infoList.push(ilist);
  //   });

  //   query.forEach((item) => {
  //     let ilist = item.split(' and');
  //     ilist = ilist.join('').split(' ');
  //     queryList.push(ilist);
  //   });

  //   queryList.forEach((q, index) => {
  //     answer[index] = 0;
  //     infoList.forEach((i) => {
  //       let count = 0;
  //       for (let j = 0; j < q.length; j++) {
  //         if (j === 4) {
  //           if (parseInt(q[j]) <= parseInt(i[j])) {
  //             count++;
  //           }
  //         } else {
  //           if (q[j] === '-') {
  //             count++;
  //           } else if (q[j] === i[j]) {
  //             count++;
  //           }
  //         }
  //       }
  //       if (count === 5) {
  //         answer[index]++;
  //       }
  //     });
  //   });
};
