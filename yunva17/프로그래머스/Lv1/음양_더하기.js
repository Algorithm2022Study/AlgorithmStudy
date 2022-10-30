const solution = (absolutes, signs) => {
  let answer = 0;

  signs.forEach((item, index) => {
    if (item === true) {
      answer += absolutes[index];
    } else {
      answer -= absolutes[index];
    }
  });

  return answer;
};
