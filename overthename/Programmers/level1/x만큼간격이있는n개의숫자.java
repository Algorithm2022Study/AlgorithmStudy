class Solution {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		int j=0;
		for(long i=1;i<=n;i++){
			answer[j++]=x*i;
		}


		return answer;
	}
}