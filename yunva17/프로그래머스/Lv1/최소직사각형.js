const solution = (sizes) => {
  let answer = 0;

  let resize = sizes.map((size) =>
    size[0] > size[1] ? [size[0], size[1]] : [size[1], size[0]]
  );

  let width = 0;
  let height = 0;

  resize.forEach((size) => {
    width = Math.max(width, size[0]);
    height = Math.max(height, size[1]);
  });

  answer = width * height;

  return answer;
};
