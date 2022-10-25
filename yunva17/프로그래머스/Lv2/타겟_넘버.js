const solution = (numbers, target) => {
  let answer = 0;

  const dfs = (index, sum) => {
    if (index === numbers.length) {
      if (sum === target) {
        answer++;
      }
      return;
    }

    dfs(index + 1, sum + numbers[index]);
    dfs(index + 1, sum - numbers[index]);
  };

  dfs(0, 0);

  return answer;
};
