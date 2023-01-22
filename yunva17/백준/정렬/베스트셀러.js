let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let books = {};

input.slice(1).forEach((v) => {
  let name = v.replace(/\r/g, '');
  if (!books[name]) {
    books[name] = 1;
  } else {
    books[name]++;
  }
});

books = Object.fromEntries(
  Object.entries(books).sort(([, a], [, b]) => (a > b ? -1 : 1))
);

let bookList = Object.keys(books);
let scoreList = Object.values(books);
let answer = [];

scoreList.forEach((v, i) => {
  if (v === Math.max(...scoreList)) {
    answer.push(bookList[i]);
  }
});

console.log(answer.sort((a, b) => (a < b ? -1 : 1))[0]);
