const solution = (food) => {
  let answer = '';

  for (let i = 1; i < food.length; i++) {
    answer += i.toString().repeat(Math.floor(food[i] / 2));
  }

  let ansReverse = answer.split('').reverse().join('');

  return answer + '0' + ansReverse;
};
