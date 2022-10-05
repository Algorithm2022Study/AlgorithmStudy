function solution(s) {
  var answer = true;
  var count = 0;
  var stack = [];

  for (var i = 0; i < s.length; i++) {
    if (s[i] === '(') {
      stack.push('(');
      count += 1;
    } else {
      stack.pop();
      count -= 1;
    }
  }

  if (stack.length > 0 || count !== 0) {
    answer = false;
  }

  return answer;
}
