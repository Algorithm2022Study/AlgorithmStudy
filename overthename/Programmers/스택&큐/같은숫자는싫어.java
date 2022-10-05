import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
		int[] answer = {};

		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		for(int i=1; i<=arr.length-1;i++){

			if(st.peek()!=arr[i]){
				st.push(arr[i]);
			}
		}

		int[] an = new int[st.size()];
		for(int i=0;i<st.size();i++){
			an[i]=st.get(i);
		}
		return an;
	}
}