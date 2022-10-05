function solution(n) {
  var answer = 0;

  for (var i = 1; i <= n; i++) {
    var sum = 0;
    for (var j = i; j <= n; j++) {
      sum += j;
      if (sum === n) {
        answer += 1;
        break;
      } else if (sum > n) {
        break;
      }
    }
  }
  return answer;
}
