let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let answer = Array(parseInt(input[0])).fill(0);

for (let i = 1; i < input.length; i++) {
  let qlist = input[i].split('');
  let count = 1;
  for (let j = 0; j < qlist.length; j++) {
    if (qlist[j] === 'O') {
      answer[i - 1] += count;
      count++;
    } else {
      count = 1;
    }
  }
}
answer.forEach((i) => console.log(i));
