let input = require('fs').readFileSync('dev/stdin').toString();

let nList = input.split('').map((i) => {
  return parseInt(i);
});

let nCheckList = Array(10).fill(0);

nList.forEach((item) => {
  nCheckList[item] += 1;
});

let nineSix = Math.ceil((nCheckList[6] + nCheckList[9]) / 2);
let restMax = Math.max(
  ...[...nCheckList.slice(0, 6), ...nCheckList.slice(7, 9)]
);

console.log(Math.max(nineSix, restMax));
