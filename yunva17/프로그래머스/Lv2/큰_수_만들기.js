const solution = (number, k) => {
  let answer = '';
  let stack = [];

  number.split('').forEach((item) => {
    if (stack.length === 0) {
      stack.push(item);
      return;
    }

    while (k > 0 && stack[stack.length - 1] < item) {
      stack.pop();
      k--;
    }

    stack.push(item);
  });

  answer = stack.join('').substr(0, stack.length - k);

  return answer;
};
