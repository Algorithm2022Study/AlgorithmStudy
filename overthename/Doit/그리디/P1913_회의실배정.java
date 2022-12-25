package overthename.그리디;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1913_회의실배정 {
	public static  void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][]A = new int[N][2];

		//배열만들기
		for(int i=0; i<N; i++){
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]){
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
		});

		int count=0;
		int end=-1;
		for(int i=0; i<N; i++){
			if(A[i][0]>=end){
				end=A[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
