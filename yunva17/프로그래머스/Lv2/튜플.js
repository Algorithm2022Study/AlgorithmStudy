function solution(s) {
  let answer = [];
  let reg = /[\{\}]/gim;
  let tuple = s.replace(reg, '').split(',').map(Number);
  let map = {};

  tuple.forEach((item) => {
    if (!map[item]) {
      map[item] = 1;
    } else {
      map[item]++;
    }
  });

  let sorted = Object.entries(map).sort((a, b) => b[1] - a[1]);
  for (let element of sorted) {
    answer.push(Number(element[0]));
  }

  return answer;
}
