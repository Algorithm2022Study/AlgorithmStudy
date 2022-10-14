function solution(progresses, speeds) {
  let answer = [];
  let restlist = progresses.map((item, index) =>
    Math.ceil((100 - item) / speeds[index])
  );
  let first = restlist[0];
  let sum = 1;

  for (let i = 1; i < restlist.length; i++) {
    if (first >= restlist[i]) {
      sum++;
    } else {
      answer.push(sum);
      first = restlist[i];
      sum = 1;
    }
  }
  answer.push(sum);

  return answer;
}
