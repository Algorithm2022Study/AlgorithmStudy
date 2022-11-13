let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
input.shift();
input.sort();

let answer = '';
let ilist = {};

input.forEach((item) => {
  if (ilist[item[0]]) {
    ilist[item[0]]++;
  } else {
    ilist[item[0]] = 1;
  }
});

for (let key in ilist) {
  if (ilist[key] >= 5) {
    answer += key;
  }
}

console.log(answer.length === 0 ? 'PREDAJA' : answer);
