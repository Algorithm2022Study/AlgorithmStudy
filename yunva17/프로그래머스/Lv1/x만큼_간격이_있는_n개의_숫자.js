const solution = (x, n) => {
  let answer = [];
  let num = x;

  for (let i = 0; i < n; i++) {
    answer.push(num);
    num += x;
  }

  return answer;
};
