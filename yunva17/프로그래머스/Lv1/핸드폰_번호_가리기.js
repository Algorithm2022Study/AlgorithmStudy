function solution(phone_number) {
  let answer = '';
  let l = phone_number.length;
  answer = '*'.repeat(l - 4) + phone_number.slice(l - 4, l);

  return answer;
}
