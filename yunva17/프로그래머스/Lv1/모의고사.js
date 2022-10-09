function solution(answers) {
  let answer = [];

  let first = [1, 2, 3, 4, 5];
  let second = [2, 1, 2, 3, 2, 4, 2, 5];
  let third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  const sum_test = (way) => {
    let sum = 0;
    let i = 0;
    answers.map((item) => {
      if (way[i % way.length] === item) {
        sum += 1;
      }
      i++;
    });

    return sum;
  };

  let nlist = [];
  nlist.push(sum_test(first));
  nlist.push(sum_test(second));
  nlist.push(sum_test(third));

  nlist.map((item, index) => {
    if (item === Math.max(...nlist)) {
      answer.push(index + 1);
    }
  });

  return answer;
}
