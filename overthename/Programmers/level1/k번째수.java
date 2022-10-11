import java.util.*;
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];


		for(int i=0;i<commands.length;i++){
			int n=0;
			int size=commands[i][1]-commands[i][0];

			int[] list = new int[size+1];

			for(int v=commands[i][0];v<=commands[i][1];v++){
				list[n++] = array[v-1];
			}


			Arrays.sort(list);
			answer[i]=list[commands[i][2]-1];
		}




		return answer;
	}
}