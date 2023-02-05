function solution(elements) {
  let answer = [];
  let cirarr = elements.concat(elements);

  const getSum = (arr) => {
    let sum = 0;
    arr.forEach((item) => {
      sum += item;
    });

    return sum;
  };

  for (let i = 0; i < elements.length; i++) {
    for (let j = i + 1; j < elements.length + i + 1; j++) {
      answer.push(getSum(cirarr.slice(i, j)));
    }
  }

  return [...new Set(answer)].length;
}

// 원형 수열이기 때문에 elements.concat(elements)으로 이어져 보이도록 함
// 이중 반복문으로 1, 2, 3 ... length 개수까지 slice로 잘라준 뒤에 각각 sum을 구해줌
// 그 다음 set으로 중복 숫자 제거하고 그 size를 return 함
