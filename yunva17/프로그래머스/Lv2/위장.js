function solution(clothes) {
  let answer = 1;
  let cmap = {};

  for (let item of clothes) {
    if (!cmap[item[1]]) {
      cmap[item[1]] = 0;
    }
    cmap[item[1]] += 1;
  }

  for (let key of Object.keys(cmap)) {
    answer *= cmap[key] + 1;
  }

  return answer - 1;
}
