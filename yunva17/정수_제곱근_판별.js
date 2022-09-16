function solution(n) {
  var answer = 0;
  var half = Math.sqrt(n);

  if (half % 1 === 0) {
    answer = Math.pow(half + 1, 2);
  } else {
    answer = -1;
  }
  return answer;
}
