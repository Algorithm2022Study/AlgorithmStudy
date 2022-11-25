function solution(fees, records) {
  let answer = [];
  let carList = {};
  const [basicTime, basicFee, mTime, fee] = fees;

  records.forEach((car) => {
    let carInfo = car.split(' ');
    let time = carInfo[0].replace(':', '');

    // 시간 분으로 계산
    let minuteTime =
      parseInt(time.slice(0, 2)) * 60 + parseInt(time.slice(2, 4));

    // 기존 carList에 없으면
    if (!carList[carInfo[1]]) {
      carList[carInfo[1]] = { time: 0 };
    }

    // 최신 상태 반영
    carList[carInfo[1]].status = carInfo[2];

    // 현재 시간 - 마지막 시간 -> 누적 시간 구하기
    if (carInfo[2] === 'OUT') {
      carList[carInfo[1]].time += minuteTime - carList[carInfo[1]].lastTime;
      return;
    }

    carList[carInfo[1]].lastTime = minuteTime;
  });

  // 최종 누적시간 계산
  for (let car of Object.entries(carList)) {
    if (car[1].status === 'IN') {
      carList[car[0]].time += 1439 - carList[car[0]].lastTime;
    }
  }
  // 정렬 후 요금 계산
  for (let car of Object.entries(carList)) {
    let cost = 0;
    if (car[1].time >= basicTime) {
      cost = basicFee + Math.ceil((car[1].time - basicTime) / mTime) * fee;
    } else {
      cost = basicFee;
    }

    answer.push([parseInt(car[0]), cost]);
  }

  answer = answer.sort((a, b) => a[0] - b[0]).map((i) => i[1]);

  return answer;
}
