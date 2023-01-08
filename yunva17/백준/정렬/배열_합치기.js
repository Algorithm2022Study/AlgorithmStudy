let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let alist = [];
input.slice(1).map((i) => i.split(' ').map((n) => alist.push(parseInt(n))));

console.log(alist.sort((a, b) => a - b).join(' '));
