let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

let caseList = input.slice(1).map(Number);
let dp = [0, 1, 2, 4];

for (let i = 4; i < 11; i++) {
  dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
}

caseList.forEach((i) => {
  console.log(dp[i]);
});
