function solution(numbers) {
  let answer = [];

  for (let i = 0; i < numbers.length - 1; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      let sum = numbers[i] + numbers[j];

      answer.push(sum);
    }
  }

  answer = answer.filter((item, i) => answer.indexOf(item) === i);
  answer.sort((a, b) => a - b);

  return answer;
}
