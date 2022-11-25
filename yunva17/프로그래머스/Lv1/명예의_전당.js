function solution(k, score) {
  let answer = [];
  let klist = [];

  for (let i = 0; i < score.length; i++) {
    klist.push(score[i]);
    klist.sort((a, b) => b - a);

    if (i < k - 1) {
      klist = klist.slice(0, i + 1);
      answer.push(klist[i]);
    } else {
      klist = klist.slice(0, k);
      answer.push(klist[k - 1]);
    }
  }

  return answer;
}
