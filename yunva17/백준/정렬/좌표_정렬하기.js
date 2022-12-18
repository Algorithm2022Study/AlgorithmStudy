let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

let xyList = input
  .slice(1)
  .map((item) => item.split(' ').map((num) => parseInt(num)));

let answer = '';

xyList
  .sort((a, b) => {
    if (a[0] === b[0]) {
      return a[1] - b[1];
    } else {
      return a[0] - b[0];
    }
  })
  .forEach((item) => (answer += `${item[0]} ${item[1]}\n`));

console.log(answer);
