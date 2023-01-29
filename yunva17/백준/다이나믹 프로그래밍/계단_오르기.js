let input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');

const n = parseInt(input[0]);
let stairs = input.slice(1).map(Number);

let dp = new Array(n).fill(0);
dp[0] = stairs[0];
dp[1] = Math.max(stairs[0] + stairs[1], stairs[1]);
dp[2] = Math.max(stairs[0], stairs[1]) + stairs[2];

for (let i = 3; i < stairs.length; i++) {
  dp[i] = Math.max(
    stairs[i] + stairs[i - 1] + dp[i - 3],
    stairs[i] + dp[i - 2]
  );
}

console.log(dp[n - 1]);
