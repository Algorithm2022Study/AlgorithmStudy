let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split(' ')
  .map((i) => parseInt(i));

console.log(
  Math.min(input[0], input[1], input[2] - input[0], input[3] - input[1])
);
