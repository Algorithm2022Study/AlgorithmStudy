let input = require('fs').readFileSync('dev/stdin').toString().trim();

let num = parseInt(input);
let n = 0;
let answer = 0;
while (n < num) {
  let sum = n;
  let nstr = n.toString();

  for (let i = 0; i < nstr.length; i++) {
    sum += parseInt(nstr[i]);
  }

  if (sum === num) {
    answer = n;
    break;
  }
  n++;
}

console.log(answer);
