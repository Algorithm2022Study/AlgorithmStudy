function solution(t, p) {
  let answer = 0;
  const N = p.length;

  for (let i = 0; i < t.length - N + 1; i++) {
    let strNum = Number(t.substr(i, N));

    if (strNum <= Number(p)) {
      answer++;
    }
  }

  return answer;
}
