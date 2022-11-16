function solution(d, budget) {
  let answer = 0;
  let sum = 0;

  d = d.sort((a, b) => a - b);

  d.forEach((item) => {
    sum += item;
    answer++;
    if (sum > budget) {
      answer -= 1;
    }
  });

  return answer;
}
