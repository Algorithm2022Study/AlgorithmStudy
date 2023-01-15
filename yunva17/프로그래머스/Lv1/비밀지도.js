const solution = (n, arr1, arr2) => {
  let answer = Array(n).fill('');

  for (let i = 0; i < n; i++) {
    arr1[i] = arr1[i].toString(2);
    arr2[i] = arr2[i].toString(2);

    if (arr1[i].length !== n) {
      arr1[i] = '0'.repeat(n - arr1[i].length) + arr1[i];
    }
    if (arr2[i].length !== n) {
      arr2[i] = '0'.repeat(n - arr2[i].length) + arr2[i];
    }

    for (let j = 0; j < n; j++) {
      if (arr1[i][j] === '1' || arr2[i][j] === '1') {
        answer[i] += '#';
      } else {
        answer[i] += ' ';
      }
    }
  }

  return answer;
};
