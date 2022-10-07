function solution(record) {
  let answer = [];
  const userList = new Map();

  // userList 정리
  record.map((item) => {
    let message = item.split(' ');
    if (message[0] === 'Change' || message[0] === 'Enter') {
      userList[message[1]] = message[2];
    }
  });

  // 메세지 정리
  record.map((item) => {
    let message = item.split(' ');
    if (message[0] === 'Enter') {
      answer.push(userList[message[1]] + '님이 들어왔습니다.');
    } else if (message[0] === 'Leave') {
      answer.push(userList[message[1]] + '님이 나갔습니다.');
    }
  });

  return answer;
}
