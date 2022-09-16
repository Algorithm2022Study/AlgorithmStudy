function solution(n) {
  var answer = [];
  var nlist = String(n).split('');

  for (var i = 0; i < nlist.length; i++) {
    answer[i] = parseInt(nlist[nlist.length - 1 - i]);
  }

  return answer;
}
