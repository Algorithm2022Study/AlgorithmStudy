let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

const order = input.slice(1);
let deque = [];
let answer = [];

order.map((item, index) => {
  order[index] = order[index].split(' ');
  order[index][0] = order[index][0].replace(/\r/g, '');
});

for (let i = 0; i < order.length; i++) {
  if (order[i][0] === 'push_front') {
    deque.unshift(parseInt(order[i][1]));
  } else if (order[i][0] === 'push_back') {
    deque.push(parseInt(order[i][1]));
  } else if (order[i][0] === 'pop_front') {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque.shift());
    }
  } else if (order[i][0] === 'pop_back') {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque.pop());
    }
  } else if (order[i][0] === 'size') {
    answer.push(deque.length);
  } else if (order[i][0] === 'empty') {
    deque.length === 0 ? answer.push(1) : answer.push(0);
  } else if (order[i][0] === 'front') {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque[0]);
    }
  } else if (order[i][0] === 'back') {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque[deque.length - 1]);
    }
  }
}

console.log(answer.join('\n'));
