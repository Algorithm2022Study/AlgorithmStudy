let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let nlist = input[1].split(' ').map((i) => parseInt(i));
let k = parseInt(input[0].split(' ')[1]);

nlist.sort((a, b) => a - b);
console.log(nlist[k - 1]);
