function solution(arr) {
  var answer = 0;
  var sum = 0;

  for (i = 0; i < arr.length; i++) {
    sum += arr[i];
  }

  answer = sum / arr.length;

  return answer;
}
