function solution(s) {
  var answer = '';
  var slist = s.split(' ');
  slist = slist.map((item) => parseInt(item));

  answer = Math.min(...slist) + ' ' + Math.max(...slist);
  return answer;
}
