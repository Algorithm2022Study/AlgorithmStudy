let input = require('fs')
  .readFileSync('dev/stdin')
  .toString()
  .trim()
  .split('\n');

input.forEach((item, index) => {
  item = item.toString();
  itemReverse = item.split('').reverse().join('');
  if (index === input.length - 1) {
    return;
  }
  if (parseInt(item) === parseInt(itemReverse)) {
    console.log('yes');
  } else {
    console.log('no');
  }
});
