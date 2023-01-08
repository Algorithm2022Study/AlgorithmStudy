let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let numlist = input.slice(1);

numlist.forEach((v, i) => {
  numlist[i] = v.replace(/\r/g, '');
});

const numSum = (num) => {
  let changeNum = num.replace(/[^0-9]/g, '');
  let sum = 0;
  changeNum = changeNum.split('').map((v) => (sum += parseInt(v)));

  return sum;
};

numlist.sort((a, b) => {
  if (a.length !== b.length) {
    return a.length - b.length;
  } else {
    if (numSum(a) === numSum(b)) {
      return a == b ? 0 : a > b ? 1 : -1;
    } else {
      return numSum(a) - numSum(b);
    }
  }
});

numlist.forEach((v) => console.log(v));
