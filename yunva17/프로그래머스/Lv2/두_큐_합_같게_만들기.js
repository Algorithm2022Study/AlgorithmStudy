const solution = (queue1, queue2) => {
  let queue1Sum = queue1.reduce((a, b) => a + b);
  let queue2Sum = queue2.reduce((a, b) => a + b);

  const sum = (queue1Sum + queue2Sum) / 2;
  const queue = [...queue1, ...queue2];

  let left = 0,
    right = queue1.length;
  let count = 0;

  while (count <= queue.length * 3) {
    if (sum === queue1Sum) {
      return count;
    } else if (queue1Sum > sum) {
      queue1Sum -= queue[left++];
    } else {
      queue1Sum += queue[right++];
    }
    count++;
  }

  return -1;
};

// 투 포인터
