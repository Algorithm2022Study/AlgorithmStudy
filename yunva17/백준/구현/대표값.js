let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n')
  .map((i) => parseInt(i));

let sum = 0;
let count = {};
let check = [];

input.forEach((item) => {
  if (!count[item]) {
    count[item] = 1;
  } else {
    count[item]++;
  }
  sum += item;
});

for (let key in count) {
  check.push([key, count[key]]);
}

check.sort((a, b) => b[1] - a[1]);

console.log(sum / 10);
console.log(check[0][0]);
