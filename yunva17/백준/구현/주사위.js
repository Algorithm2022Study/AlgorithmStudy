let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ');

let s1 = parseInt(input[0]);
let s2 = parseInt(input[1]);
let s3 = parseInt(input[2]);

let nlist = new Array(s1 + s2 + s3 + 1).fill(0);
let count = 0;

for (let i = 1; i <= s1; i++) {
  for (let j = 1; j <= s2; j++) {
    for (let k = 1; k <= s3; k++) {
      count = i + j + k;
      nlist[count] += 1;
      count = 0;
    }
  }
}

console.log(nlist.indexOf(Math.max(...nlist)));
