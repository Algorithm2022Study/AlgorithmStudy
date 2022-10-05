import java.util.*;
class Solution {
	public boolean solution(int x) {
		boolean answer = true;

		String number = Integer.toString(x);

		int sum=0;
		for(int i=0; i<number.length();i++){
			sum+= Integer.parseInt(String.valueOf(number.charAt(i)));
		}

		if(x%sum==0){
			return true;
		}else{
			return false;
		}
	}
}