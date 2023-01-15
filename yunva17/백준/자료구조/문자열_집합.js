let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

const n = input.shift().split(' ').map(Number)[0];
let strInput = input.map((i) => i.trim());
const N = new Set(strInput.slice(0, n));
const M = strInput.slice(n);

let answer = 0;

M.forEach((item) => {
  if (N.has(item)) {
    answer++;
  }
});

console.log(answer);
