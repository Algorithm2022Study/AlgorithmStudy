let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split(' ');

const N = Number(input[0]);
let kim = Number(input[1]);
let lim = Number(input[2]);

let answer = 0;

while (kim !== lim) {
  kim = Math.ceil(kim / 2);
  lim = Math.ceil(lim / 2);
  answer++;
}

console.log(answer);
