
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택수열 {
	public static  void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for( int i=0; i<N; i++){
			A[i]= sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num=1;
		boolean result = true;
		for(int i=0; i<A.length; i++){
			int su = A[i]; //현재 수열의 수
			if (su>=num){ //현재 수열값>=자연수
				while (su>=num){
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");

			}
			else{ //현재 수열 값< 자연수
				int n= stack.pop(); //스택 가장 위의 수
				if(n>su){ //스택 위의 수> 수열 수
					System.out.println("No");
					result = false;
					break;
				}
				else{
					bf.append("-\n");
				}
			}

		}
		if(result) System.out.println(bf.toString());

	}
}
