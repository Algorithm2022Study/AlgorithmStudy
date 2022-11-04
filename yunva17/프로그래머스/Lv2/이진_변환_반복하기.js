const solution = (s) => {
  let answer = [0, 0];
  let slist = s.split('');

  while (slist.join('') !== '1') {
    let zero = 0;
    slist.forEach((item) => {
      if (item === '0') {
        zero++;
      }
    });

    // 0 제거
    slist = slist.filter((item) => item !== '0');
    answer[1] += zero;

    // 이진 변환
    slist = slist.length.toString(2).split('');

    answer[0] += 1;
  }

  return answer;
};
