let input = require('fs').readFileSync('/dev/stdin').toString().trim();

let board = input.replace(/XXXX/g, 'AAAA');
board = board.replace(/XX/g, 'BB');

if (board.includes('X')) {
  console.log(-1);
} else {
  console.log(board);
}

// 먼저 연속된 부분은 AAAA나 BB로 변경해주고
// 만약 변경되지 않아 X가 남아있다면 -1을 출력
