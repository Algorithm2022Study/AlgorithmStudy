class Solution {
	public String solution(String s) {
		String answer = "";
		boolean first = true;
		String[] arr = s.toLowerCase().split("");

		for(String str : arr){

			answer+= (first? str.toUpperCase() :str);
			first = str.equals(" ")?true:false;
		}



		return answer;
	}
}