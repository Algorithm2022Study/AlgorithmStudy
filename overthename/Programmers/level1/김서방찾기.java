class Solution {
	public String solution(String[] seoul) {
		String answer = "";

		int number =0;

		for(int i=0; i<seoul.length; i++){
			if(seoul[i].equals("Kim")){
				number=i;

			}
		}

		return "김서방은 "+number+"에 있다";
	}
}