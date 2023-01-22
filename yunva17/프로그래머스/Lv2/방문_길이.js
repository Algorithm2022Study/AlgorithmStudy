function solution(dirs) {
  let now = [0, 0];
  let visited = [];

  for (let dir of dirs) {
    let next = [now[0], now[1]];

    if (dir === 'U') {
      next[1] += 1;
    } else if (dir === 'D') {
      next[1] -= 1;
    } else if (dir === 'L') {
      next[0] -= 1;
    } else if (dir === 'R') {
      next[0] += 1;
    }
    if (next[0] > 5 || next[0] < -5 || next[1] > 5 || next[1] < -5) {
      continue;
    }

    let plus = now.join('') + next.join('');
    let pluss = next.join('') + now.join('');

    if (!visited.includes(plus) && plus !== pluss) {
      visited.push(plus);
      visited.push(pluss);
    }

    now = next;
  }

  return visited.length / 2;
}
