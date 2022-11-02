const solution = (cacheSize, cities) => {
  let answer = 0;
  let clist = [];

  cities = cities.map((item) => item.toUpperCase());

  cities.forEach((item) => {
    if (clist.includes(item)) {
      clist = clist.filter((value) => value !== item);
      clist.push(item);
      answer += 1;
    } else if (clist.length < cacheSize) {
      clist.push(item);
      answer += 5;
    } else if (cacheSize === 0) {
      answer += 5;
    } else {
      clist.shift();
      clist.push(item);
      answer += 5;
    }
  });

  return answer;
};
