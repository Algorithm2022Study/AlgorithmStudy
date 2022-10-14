const solution = (n, lost, reserve) => {
  let answer = n;

  // lost, reserve 중복 제거
  reserve.map((item) => {
    if (lost.includes(item)) {
      reserve = reserve.filter((x) => x !== item);
      lost = lost.filter((x) => x !== item);
    }
  });

  for (let i = 1; i <= n; i++) {
    if (lost.includes(i)) {
      if (reserve.includes(i - 1)) {
        reserve = reserve.filter((item) => item !== i - 1);
      } else if (reserve.includes(i + 1)) {
        reserve = reserve.filter((item) => item !== i + 1);
      } else {
        answer -= 1;
      }
    }
  }

  return answer;
};
