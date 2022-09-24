function solution(A, B) {
  var answer = 0;

  var maxA = A.sort((a, b) => b - a); // 내림차순 정렬
  var minB = B.sort((a, b) => a - b); // 오름차순 정렬

  for (var i = 0; i < A.length; i++) {
    answer += maxA[i] * minB[i];
  }

  return answer;
}
