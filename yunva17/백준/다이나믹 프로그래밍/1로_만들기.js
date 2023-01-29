let input = require('fs').readFileSync('/dev/stdin').toString().trim();

const num = Number(input);
const dp = new Array(num + 1).fill(0);

for (let i = 2; i < dp.length; i++) {
  // 1을 뺀 경우 (+1은 경우의 수 추가)
  dp[i] = dp[i - 1] + 1;

  if (i % 2 === 0) {
    dp[i] = Math.min(dp[i], dp[i / 2] + 1);
  }

  if (i % 3 === 0) {
    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
  }
}

console.log(dp[num]);
