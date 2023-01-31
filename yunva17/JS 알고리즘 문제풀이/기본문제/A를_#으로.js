function solution(s) {
  let answer = '';
  for (let x of s) {
    if (x === 'A') answer += '#';
    else answer += x;
  }
  return answer;
}
