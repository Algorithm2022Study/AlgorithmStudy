class Solution {
	public int solution(int n) {
		int answer = 0;

		boolean isSo;
		for(int i=2;i<=n; i++){
			isSo =true;
			for(int j=2; j<=Math.sqrt(i);j++){
				if(i%j ==0){
					isSo = false;
					break;
				}
			}
			if(isSo){answer++;}
		}


		return answer;
	}
}