let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let answer = 0;
let cost = parseInt(input[0].split(' ')[1]);
let coins = input
  .slice(1)
  .map((i) => parseInt(i))
  .sort((a, b) => b - a);

coins.forEach((v) => {
  while (v <= cost) {
    cost = cost - v;
    answer += 1;
  }
});

console.log(answer);
