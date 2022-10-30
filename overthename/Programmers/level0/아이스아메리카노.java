class Solution {
	public int[] solution(int money) {
		int[] answer = {0,0};
		answer[0]=money/5500;
		answer[1]=money%5500;
		return answer;
	}
}