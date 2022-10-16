function solution(arr, divisor) {
  let answer = [];

  arr.forEach((item) => {
    if (item % divisor === 0) {
      answer.push(item);
    }
  });

  if (answer.length === 0) {
    return [-1];
  }

  return answer.sort((a, b) => a - b);
}
