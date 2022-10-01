class Solution {
	public long solution(int price, int money, int count) {
		long answer = -1;

		long sum=0;
		for(int i=1;i<=count;i++){
			sum += price * i;
		}

		if(money<=sum){
			return sum-money;
		}else{
			return 0;
		}
	}
}