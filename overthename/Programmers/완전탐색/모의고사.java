import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int[] solution(int[] answers) {
		int[] score = {0,0,0};
		ArrayList<Integer> maxScore = new ArrayList<Integer>();
		int[][] patterns = {{1,2,3,4,5},
			{2,1,2,3,2,4,2,5},
			{3,3,1,1,2,2,4,4,5,5}};

		for(int i = 0; i < answers.length; i++) {
			if (patterns[0][i%5] == answers[i]) {
				score[0]++;
			}
			if (patterns[1][i%8] == answers[i]) {
				score[1]++;
			}
			if (patterns[2][i%10] == answers[i]) {
				score[2]++;
			}
		}

		int [] sortScore = score.clone();
		Arrays.sort(sortScore);
		int max = sortScore[2];
		for(int i = 0; i < score.length; i++) {
			if(score[i]==max) {
				maxScore.add(i+1);
			}
		}

		int[] answer = new int[maxScore.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = maxScore.get(i);
		}
		return answer;
	}
}