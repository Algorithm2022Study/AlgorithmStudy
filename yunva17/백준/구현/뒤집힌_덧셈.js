let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split(' ');

const Rev = (num) => {
  num = num.toString();

  return parseInt(num.split('').reverse().join(''));
};

console.log(Rev(Rev(input[0]) + Rev(input[1])));
