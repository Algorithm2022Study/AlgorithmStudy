function solution(s) {
  let answer = '';
  let slist = s.split(' ');

  slist.map((item, i) => {
    for (let i = 0; i < item.length; i++) {
      if (i % 2 === 0) {
        answer += item[i].toUpperCase();
      } else {
        answer += item[i].toLowerCase();
      }
    }
    if (i !== slist.length - 1) {
      answer += ' ';
    }
  });

  return answer;
}
