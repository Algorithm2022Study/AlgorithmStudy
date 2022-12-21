let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let answer = [];
input = input.map((i) => parseInt(i));

input.forEach((i) => {
  answer.push(i % 42);
});

answer = [...new Set(answer)];

console.log(answer.length);
