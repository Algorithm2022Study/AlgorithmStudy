const solution = (a, b) => {
  let dates = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU'];
  let months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  let week = b - 1;

  for (let i = 1; i < a; i++) {
    week += months[i - 1];
  }
  return dates[week % 7];
};
