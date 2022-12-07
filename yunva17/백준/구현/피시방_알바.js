let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let answer = 0;
let seat = {};
const guest = input[1].split(' ');

guest.forEach((item) => {
  if (!seat[item]) {
    seat[item] = 1;
  } else {
    answer += 1;
  }
});

console.log(answer);
