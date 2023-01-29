let input = require('fs').readFileSync('/dev/stdin').toString().trim();

let num = parseInt(input);

if (num % 2 === 0) {
  console.log('CY');
} else {
  console.log('SK');
}
