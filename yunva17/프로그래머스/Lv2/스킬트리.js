const solution = (skill, skill_trees) => {
  let answer = 0;

  const skillTest = (skillList) => {
    let index = 0;

    for (let i = 0; i < skillList.length; i++) {
      if (skill.includes(skillList[i])) {
        if (skillList[i] !== skill[index]) {
          return false;
        } else {
          index++;
        }
      }
    }
    return true;
  };

  skill_trees.forEach((v) => {
    let skillList = v.split('');

    if (skillTest(skillList)) {
      answer++;
    }
  });

  return answer;
};
