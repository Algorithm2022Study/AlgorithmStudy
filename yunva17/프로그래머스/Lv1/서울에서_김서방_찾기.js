function solution(seoul) {
  var answer = '';

  if (seoul.indexOf('Kim') !== -1) {
    answer = '김서방은 ' + seoul.indexOf('Kim') + '에 있다';
  }

  return answer;
}
