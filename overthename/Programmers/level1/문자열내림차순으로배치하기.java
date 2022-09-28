import java.util.*;
class Solution {
	public String solution(String s) {
		String answer = "";

		char[] list = s.toCharArray();

		Arrays.sort(list);


		for(int i=list.length-1; i>=0;i--){
			answer+=list[i];
		}

		return answer;
	}
}