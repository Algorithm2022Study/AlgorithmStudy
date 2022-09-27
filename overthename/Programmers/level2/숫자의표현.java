class Solution {
	public int solution(int n) {
		int answer = 0;
		int num=0;
		for(int i=1;i<=n;i++){
			int sum=0;
			for(int j=i;i<=n; j++){
				sum+=j;
				if(sum==n){
					num++;
					break;
				}else if(sum>n){
					break;
				}
			}
		}
		return num;
	}
}