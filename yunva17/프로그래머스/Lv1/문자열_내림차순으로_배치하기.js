function solution(s) {
  let answer = '';

  answer = s
    .split('')
    .sort((a, b) => b.charCodeAt() - a.charCodeAt())
    .join('');

  return answer;
}
