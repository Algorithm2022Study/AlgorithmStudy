let input = require('fs').readFileSync('/dev/stdin').toString().trim();

let num = parseInt(input);
let dp = new Array(num + 1);

dp[1] = 1;
dp[2] = 1;

for (let i = 3; i < dp.length; i++) {
  dp[i] = BigInt(dp[i - 1]) + BigInt(dp[i - 2]);
}

console.log(dp[num].toString());
