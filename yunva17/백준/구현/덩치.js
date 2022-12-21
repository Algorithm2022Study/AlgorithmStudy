let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let people = input.slice(1);
let answer = [];

// people 숫자화
people.forEach((item, index) => {
  people[index] = people[index].split(' ').map((i) => parseInt(i));
});

for (let i = 0; i < people.length; i++) {
  let count = 0;
  for (let j = 0; j < people.length; j++) {
    if (i !== j) {
      if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
        count++;
      }
    }
  }
  answer.push(count + 1);
}

console.log(answer.join(' '));
