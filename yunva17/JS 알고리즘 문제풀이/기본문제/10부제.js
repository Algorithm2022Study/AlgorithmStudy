function solution(day, arr) {
  let answer = 0;
  for (let x of arr) {
    if (x % 10 == day) {
      answer++;
    }
  }

  return answer;
}
