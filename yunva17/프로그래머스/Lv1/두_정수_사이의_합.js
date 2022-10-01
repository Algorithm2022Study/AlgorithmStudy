function solution(a, b) {
  var answer = 0;
  let nlist = [a, b];

  if (a === b) {
    return a;
  }

  for (let i = Math.min(...nlist); i <= Math.max(...nlist); i++) {
    answer += i;
  }

  return answer;
}
