package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());

		Stack<Integer> stack=new Stack<>();

		StringBuilder sb=new StringBuilder();
		int now=0;
		while(n-->0){
			int start=Integer.parseInt(br.readLine());
			if(start>now){
				for(int i=now+1;i<=start;i++){
					stack.push(i);
					sb.append("+");
					sb.append("\n");
				}
				now=start;
			}else if(stack.peek()!=start) {
				System.out.println("NO");
				return;
			}
				stack.pop();
				sb.append("-");
				sb.append("\n");
		}
		System.out.println(sb);
	}
}
