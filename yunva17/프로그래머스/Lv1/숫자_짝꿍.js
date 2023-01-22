function solution(X, Y) {
  let answer = [];
  let sameList = {};

  for (let i = 0; i < X.length; i++) {
    if (sameList[X[i]]) {
      sameList[X[i]]++;
    } else {
      sameList[X[i]] = 1;
    }
  }

  for (let i = 0; i < Y.length; i++) {
    if (sameList[Y[i]] > 0) {
      sameList[Y[i]]--;
      answer.push(Y[i]);
    }
  }

  if (answer[0] === undefined) {
    return '-1';
  } else if (answer[0] === '0') {
    return '0';
  } else {
    return answer.sort((a, b) => b - a).join('');
  }
}
