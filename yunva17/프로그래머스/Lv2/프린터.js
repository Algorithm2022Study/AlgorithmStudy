function solution(priorities, location) {
  let answer = [];
  let ilist = priorities.map((item, index) => [item, index]);

  while (ilist.length > 0) {
    let x = ilist.shift();
    let maxlist = Math.max(...ilist.map((item) => item[0]));

    if (x[0] >= maxlist) {
      answer.push(x[1]);
      if (x[1] === location) break;
    } else {
      ilist.push(x);
    }
  }
  return answer.indexOf(location) + 1;
}
