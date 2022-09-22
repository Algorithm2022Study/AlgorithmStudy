function solution(s) {
  var answer = true;
  var np = s.split('p').length - 1 + s.split('P').length - 1;
  var ny = s.split('y').length - 1 + s.split('Y').length - 1;

  if (np === ny) {
    answer = true;
  } else {
    answer = false;
  }

  return answer;
}
