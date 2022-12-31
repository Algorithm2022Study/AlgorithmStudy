let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

//  숫자화
input.forEach((item, index) => {
  input[index] = input[index].split(' ').map((i) => parseInt(i));
  input[index].sort((a, b) => {
    return a - b;
  });
});

for (let i = 0; i < input.length - 1; i++) {
  if (
    Math.pow(input[i][2], 2) ===
    Math.pow(input[i][0], 2) + Math.pow(input[i][1], 2)
  ) {
    console.log('right');
  } else {
    console.log('wrong');
  }
}
