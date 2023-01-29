function solution(arr) {
  let answer = [];
  let sum = 0;
  let min = 1000;
  for (let x of arr) {
    if (x % 2 === 1) {
      sum += x;
      if (x < min) {
        min = x;
      }
    }
  }
  answer.push(sum);
  answer.push(min);
  return answer;
}
