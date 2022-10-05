function solution(n) {
  var answer = 0;
  var nlist = String(n).split('');
  answer = parseInt(nlist.sort((a, b) => b - a).join(''));
  return answer;
}
