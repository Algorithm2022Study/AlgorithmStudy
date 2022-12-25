let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

// 괄호 판별
const CheckString = (str) => {
  let stack = [];
  let result = 'YES';

  for (let i = 0; i < str.length; i++) {
    if (str[i] === '(') {
      stack.push(str[i]);
    } else {
      if (!stack.pop()) {
        result = 'NO';
        break;
      }
    }
  }

  if (stack.length !== 0) {
    result = 'NO';
  }

  return result;
};

for (let i = 1; i < input.length; i++) {
  console.log(CheckString(input[i]));
}
