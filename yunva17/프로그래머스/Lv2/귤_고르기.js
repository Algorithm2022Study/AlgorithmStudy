const solution = (k, tangerine) => {
  let answer = 0;
  let fruits = {};

  tangerine.forEach((v) => {
    if (!fruits[v]) {
      fruits[v] = 1;
    } else {
      fruits[v]++;
    }
  });

  fruits = Object.entries(fruits).sort((a, b) => b[1] - a[1]);

  fruits.forEach((v, i) => {
    if (k > 0) {
      k = k - v[1];
      answer++;
    } else {
      return;
    }
  });

  return answer;
};
