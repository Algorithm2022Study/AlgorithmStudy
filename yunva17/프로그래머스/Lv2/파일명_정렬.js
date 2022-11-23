function solution(files) {
  return files.sort((a, b) => {
    // head -> 숫자가 나오기 전까지의 문자열 추출
    let aHead = a.match(/^\D+/)[0].toLowerCase();
    let bHead = b.match(/^\D+/)[0].toLowerCase();

    // head 부분 사전 순 정렬
    if (aHead < bHead) return -1;
    if (aHead > bHead) return 1;

    // 숫자 추출하고 0 제거
    let aNumber = a.match(/\d+/)[0].replace(/^0+/, '');
    let bNumber = b.match(/\d+/)[0].replace(/^0+/, '');

    return aNumber - bNumber;
  });
}

// 실패 후 참고 수정(match와 pattern 공부하기)

// function solution(files) {
//   let answer = [];
//   let filesList = [];

//   files.forEach((file, index) => {
//     let fileInfo = {
//       name: file,
//       head: undefined,
//       number: undefined,
//       key: index,
//     };
//     for (let i = 0; i < file.length; i++) {
//       // 공백 제거
//       file = file.replace(/(\s*)/g, '');
//       if (!isNaN(file[i])) {
//         fileInfo.head = file.slice(0, i);
//         file = file.slice(i);
//         let num = '';
//         for (let j = 0; j < file.length; j++) {
//           if (!isNaN(file[j])) {
//             num += file[j];
//           } else {
//             break;
//           }
//         }
//         //let num = file.split('').filter((item) => !isNaN(item)).join('');
//         fileInfo.number = parseInt(num);
//       }
//     }
//     filesList.push(fileInfo);
//   });

//   // 우선순위 별로 정렬
//   filesList.sort((a, b) => {
//     // head 부분 사전 순
//     if (a.head.toLowerCase() > b.head.toLowerCase()) return 1;
//     if (a.head.toLowerCase() < b.head.toLowerCase()) return -1;

//     // head가 같을 시, number순
//     if (a.head.toLowerCase() === b.head.toLowerCase()) {
//       if (a.number > b.number) return 1;
//       if (a.number < b.number) return -1;
//     }
//     // number도 같을 시, 원래 입력 순
//     if (a.number === b.number) {
//       if (a.key > b.key) return 1;
//       if (a.key < b.key) return -1;
//     }
//   });
//   console.log(filesList);
//   filesList.forEach((item) => {
//     answer.push(item.name);
//   });

//   return answer;
// }
