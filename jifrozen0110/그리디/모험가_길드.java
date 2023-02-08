package 그리디;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 모험가_길드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;

		int n=Integer.parseInt(br.readLine());

		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		int count=0;
		int answer=0;
		for(int i=0;i<n;i++){
			count+=1;
			if(count>=arr[i]){
				answer+=1;
				count=0;
			}
		}

		System.out.println("answer = " + answer);

	}
}
