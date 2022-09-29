function solution(s) {
  var answer = '';
  var slength = s.length;

  if (s.length % 2 === 0) {
    answer = s[slength / 2 - 1] + s[slength / 2];
  } else {
    answer = s[Math.floor(slength / 2)];
  }

  return answer;
}
