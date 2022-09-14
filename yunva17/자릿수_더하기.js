function solution(n) {
  var answer = 0;
  var num = n.toString();

  for (i = 0; i < num.length; i++) {
    answer += parseInt(num[i]);
  }

  return answer;
}
