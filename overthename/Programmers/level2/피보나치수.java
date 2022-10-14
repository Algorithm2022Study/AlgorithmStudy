class Solution {
	public int solution(int n) {

		return fibo(n);
	}

	public int fibo(int n){
		int[] list = new int[n+1];
		list[0]=0;
		list[1]=1;

		for(int i=2;i<=n;i++){

			list[i]= (list[i-1]+list[i-2]) % 1234567;}

		return list[n] % 1234567;
	}
}