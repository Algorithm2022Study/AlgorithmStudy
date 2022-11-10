const solution = (s) => {
  if (s.length === 6 || s.length === 4) {
    if (s == parseInt(s)) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
};
