function solution(nums) {
  let setNums = [...new Set(nums)];

  return setNums.length > nums.length / 2 ? nums.length / 2 : setNums.length;
}
