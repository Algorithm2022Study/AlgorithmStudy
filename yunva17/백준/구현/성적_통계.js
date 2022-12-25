let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let classList = input.slice(1);

for (let j = 0; j < classList.length; j++) {
  let c = classList[j];

  c = c
    .split(' ')
    .slice(1)
    .sort((a, b) => {
      return b - a;
    })
    .map((i) => parseInt(i));

  let gap = 0;

  for (let i = 1; i < c.length; i++) {
    if (gap < c[i - 1] - c[i]) {
      gap = c[i - 1] - c[i];
    }
  }

  console.log('Class', j + 1);
  console.log(
    `Max ${Math.max(...c)}, Min ${Math.min(...c)}, Largest gap ${gap}`
  );
}
