const solution = (brown, yellow) => {
  let answer = [];
  let total = yellow + brown;

  for (let i = 3; i < total; i++) {
    let j = total / i; // width

    if (j < i) continue;

    if ((i - 2) * (j - 2) === yellow) {
      answer = [j, i];
    }
  }

  return answer;
};
