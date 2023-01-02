let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let books = {};
let max = 0;
let answer = '';

input.slice(1).forEach((v) => {
  let name = v.replace(/\r/g, '');
  if (!books[name]) {
    books[name] = 1;
  } else {
    books[name]++;
  }

  if (books[name] === max && answer > name) {
    answer = name;
  } else if (books[name] > max) {
    answer = name;
    max = books[name];
  }
});

console.log(answer);
