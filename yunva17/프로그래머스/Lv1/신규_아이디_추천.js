function solution(new_id) {
  let answer = '';

  answer = new_id.toLowerCase(); //1
  answer = answer
    .replace(/[^\w\-\.]/g, '') //2
    .replace(/\.+/g, '.') //3
    .replace(/^\.|\.$/, '') //4
    .slice(0, 15)
    .replace(/\.$/, ''); // 6

  if (answer.length === 0) {
    //5
    answer = 'a';
  }

  let len = answer.length;
  if (len <= 2) {
    answer = answer + answer[len - 1].repeat(3 - len);
  }

  return answer;
}
