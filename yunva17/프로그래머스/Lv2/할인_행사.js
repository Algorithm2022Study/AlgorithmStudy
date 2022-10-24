const solution = (want, number, discount) => {
  let answer = 0;

  for (let i = 0; i < discount.length - 9; i++) {
    let tenlist = discount.slice(i, i + 10);
    let sum = 0;
    want.forEach((item, index) => {
      let filterlist = tenlist.filter((a) => a === item);
      if (filterlist.length === number[index]) {
        sum += 1;
      }
    });

    if (sum === want.length) {
      answer += 1;
    }
  }

  return answer;
};
