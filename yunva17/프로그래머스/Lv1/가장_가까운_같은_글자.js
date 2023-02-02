const solution = (s) => {
  let answer = [];
  let str = new Map();

  for (let i = 0; i < s.length; i++) {
    if (str.has(s[i])) {
      answer.push(i - str.get(s[i]));
    } else {
      answer.push(-1);
    }

    str.set(s[i], i); // index 업데이트
  }

  return answer;
};
