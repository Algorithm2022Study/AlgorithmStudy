let input = require('fs').readFileSync('dev/stdin').toString();

let n = parseInt(input);
let newn = n;
let count = 0;

while (true) {
  let stringnew = newn.toString();
  let right = 0;

  if (newn < 10) {
    right = stringnew[0];
    newn = parseInt(right + right);
  } else {
    right = (parseInt(stringnew[0]) + parseInt(stringnew[1])) % 10;
    newn = parseInt(stringnew[1] + right);
  }
  count++;

  if (newn === n) {
    break;
  }
}

console.log(count);
