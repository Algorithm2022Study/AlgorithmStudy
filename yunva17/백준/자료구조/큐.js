let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

const order = input.slice(1);
let queue = [];
let answer = [];

order.map((item, index) => {
  order[index] = order[index].split(' ');
  order[index][0] = order[index][0].replace(/\r/g, '');
});

for (let i = 0; i < order.length; i++) {
  if (order[i][0] === 'push') {
    queue.push(parseInt(order[i][1]));
  } else if (order[i][0] === 'pop') {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      answer.push(queue.shift());
    }
  } else if (order[i][0] === 'size') {
    answer.push(queue.length);
  } else if (order[i][0] === 'empty') {
    queue.length === 0 ? answer.push(1) : answer.push(0);
  } else if (order[i][0] === 'front') {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      answer.push(queue[0]);
    }
  } else if (order[i][0] === 'back') {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      answer.push(queue[queue.length - 1]);
    }
  }
}

console.log(answer.join('\n'));
