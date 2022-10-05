function solution(n) {
  var answer = 0;
  var nlist = [0, 1, 2];

  for (var i = 3; i <= n; i++) {
    nlist[i] = (nlist[i - 1] + nlist[i - 2]) % 1234567;
  }
  answer = nlist[n];

  return answer;
}
