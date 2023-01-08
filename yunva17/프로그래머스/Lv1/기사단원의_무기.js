function solution(number, limit, power) {
  let answer = 0;
  let nList = [];

  // 약수의 개수 구하기
  const getNum = (num) => {
    const divisors = [];
    for (let i = 1; i <= num / 2; i++) {
      if (num % i === 0) divisors.push(i);
    }
    return [...divisors, num].length;
  };

  for (let i = 1; i <= number; i++) {
    nList.push(getNum(i));
  }

  nList.forEach((v) => {
    if (v <= limit) {
      answer += v;
    } else {
      answer += power;
    }
  });

  return answer;
}
