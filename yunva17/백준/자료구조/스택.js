let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

const order = input.slice(1);
let stack = [];
let answer = [];

order.map((item, index) => {
  order[index] = order[index].split(' ');
  order[index][0] = order[index][0].replace(/\r/g, '');
});

for (let i = 0; i < order.length; i++) {
  if (order[i][0] === 'push') {
    stack.push(parseInt(order[i][1]));
  } else if (order[i][0] === 'top') {
    if (stack.length === 0) {
      answer.push(-1);
    } else {
      answer.push(stack[stack.length - 1]);
    }
  } else if (order[i][0] === 'pop') {
    if (stack.length === 0) {
      answer.push(-1);
    } else {
      answer.push(stack.pop());
    }
  } else if (order[i][0] === 'size') {
    answer.push(stack.length);
  } else if (order[i][0] === 'empty') {
    stack.length === 0 ? answer.push(1) : answer.push(0);
  }
}

console.log(answer.join('\n'));
