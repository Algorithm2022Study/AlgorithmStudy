function solution(people, limit) {
  let answer = 0;
  people = people.sort((a, b) => a - b);

  let start = 0;
  let end = people.length - 1;

  while (start <= end) {
    if (people[start] + people[end] <= limit) {
      start++;
      end--;
    } else {
      end--;
    }
    answer++;
  }

  return answer;
}
