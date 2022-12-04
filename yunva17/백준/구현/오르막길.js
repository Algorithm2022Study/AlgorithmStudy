let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

let answer = [];
let uplist = [];
const hlist = input[1].split(' ').map((i) => parseInt(i));

for (let i = 0; i < hlist.length; i++) {
  if (i === 0) {
    uplist.push(hlist[i]);
    continue;
  }
  if (uplist[uplist.length - 1] < hlist[i]) {
    uplist.push(hlist[i]);
    continue;
  } else {
    answer.push(uplist[uplist.length - 1] - uplist[0]);
    uplist = [hlist[i]];
  }
}

answer.push(uplist[uplist.length - 1] - uplist[0]);
console.log(Math.max(...answer));
