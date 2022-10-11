import java.util.*;
class Solution {
	public int solution(int[] numbers) {
		int answer = -1;

		int sum=45;
		for(int i: numbers){
			sum -= i;
		}


		return sum;
	}
}