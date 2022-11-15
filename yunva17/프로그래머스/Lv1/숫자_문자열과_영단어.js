const solution = (s) => {
  let answer = s;

  let numList = [
    'zero',
    'one',
    'two',
    'three',
    'four',
    'five',
    'six',
    'seven',
    'eight',
    'nine',
  ];

  for (let i = 0; i < numList.length; i++) {
    let arr = answer.split(numList[i]);
    answer = arr.join(i);
  }

  // 실패(5,7,8 테스트 케이스)
  //   numList.forEach((item, index) => {
  //     if(answer.indexOf(item) !== -1) {
  //         let num = answer.indexOf(item);
  //         answer = answer.substr(0, num) + index + answer.substr(num+item.length);
  //     }
  // })

  return Number(answer);
};
