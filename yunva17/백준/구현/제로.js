let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

let numList = input.map((i) => parseInt(i));
let answerList = [];
let answer = 0;

for (let i = 1; i < numList.length; i++) {
  if (numList[i] === 0) {
    answerList.pop();
  } else {
    answerList.push(numList[i]);
  }
}

answerList.forEach((item) => (answer += item));
console.log(answer);
