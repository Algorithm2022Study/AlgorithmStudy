function solution(s) {
  let answer = '';
  let slist = s.split(' ');

  slist = slist.map(
    (item) => item.slice(0, 1).toUpperCase() + item.slice(1).toLowerCase()
  );

  console.log(slist);
  answer = slist.join(' ');
  return answer;
}
