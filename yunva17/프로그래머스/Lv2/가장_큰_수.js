const solution = (numbers) => {
  let answer = '';

  answer = numbers
    .sort((a, b) => b.toString() + a.toString() - (a.toString() + b.toString()))
    .join('');

  // 다른 사람 풀이
  //numbers.map((a) => String(a)).sort((a, b) => b + a - (a + b));

  return answer[0] === '0' ? '0' : answer;
};
