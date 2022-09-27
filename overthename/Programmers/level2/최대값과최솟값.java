class Solution {
	public String solution(String s) {
		String answer = "";

		String[] list = s.split(" ");
		int min=Integer.parseInt(list[0]);
		int max=Integer.parseInt(list[0]);
		int n=0;
		for(int i=1; i< list.length; i++){
			n = Integer.parseInt(list[i]);
			if(min>n) min=n;
			if(max<n) max=n;
		}

		return min+" "+max;
	}
}
