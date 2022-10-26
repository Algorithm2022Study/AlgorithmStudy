function solution(a, b) {
  let answer = 0;

  a.forEach((item, index) => {
    answer += item * b[index];
  });

  return answer;
}
