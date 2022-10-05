function solution(n, words) {
  var answer = [0, 0];

  for (var i = 1; i < words.length; i++) {
    var a = (i + 1) % n === 0 ? n : (i + 1) % n;
    var b = Math.ceil((i + 1) / n);

    if (
      words[i][0] !== words[i - 1].slice(-1) ||
      words.slice(0, i).includes(words[i])
    ) {
      return [a, b];
    }
  }

  return answer;
}
