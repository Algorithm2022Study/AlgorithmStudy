const solution = (citations) => {
  let answer = 0;
  citations = citations.sort((a, b) => b - a); // 내림차순 정렬

  for (let i = 0; i < citations.length; i++) {
    if (i < citations[i]) {
      answer++;
    }
  }

  return answer;
};
