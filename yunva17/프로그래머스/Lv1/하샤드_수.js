function solution(x) {
  var answer = true;
  var nString = x.toString();
  var nSum = 0;

  for (var i = 0; i < nString.length; i++) {
    nSum += parseInt(nString[i]);
  }

  if (x % nSum === 0) {
    answer = true;
  } else {
    answer = false;
  }

  return answer;
}
