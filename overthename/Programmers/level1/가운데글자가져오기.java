import java.util.*;
class Solution {
	public String solution(String s) {
		String answer = "";

		String[] list = s.split("");

		int length=(list.length-1)/2;


		if(list.length%2==0){
			for(int i=length;i<=length+1; i++){
				answer+=list[i];}
		}else{
			answer=list[(list.length-1)/2];
		}


		return answer;
	}
}