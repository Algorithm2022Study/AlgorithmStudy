import java.util.*;
class Solution {
	public int[] solution(int[] arr, int divisor) {

		int[] answer= {};

		List<Integer> intList = new ArrayList<Integer>();

		for(int i=0; i<=arr.length-1; i++){
			if(arr[i]%divisor==0){
				intList.add(arr[i]);
			}
		}


		if (intList.size()==0){
			intList.add(-1);
		}

		int[] answer1 = intList.stream()
			.mapToInt(Integer::intValue)
			.toArray();

		Arrays.sort(answer1);
		return answer1;

	}
}