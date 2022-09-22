package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();

		int[] A=new int[N];
		int[] ans=new int[N];

		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(st.nextToken());
		}
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(0);

		for(int i=1;i<N;i++) {
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()]=A[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
				ans[stack.pop()]=-1;
		}
		for(int i=0;i<N;i++){
			sb.append(ans[i]+" ");
		}

		System.out.println(sb);
	}
}
