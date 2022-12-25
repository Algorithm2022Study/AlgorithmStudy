package stack_queue;
import java.util.*;


public class 쇠막대기 {
	public int solution(String n) {

		int answer=0;

		Stack<Character> st = new Stack<Character>();



		for(int i=0; i<n.length();i++) {

			if(n.charAt(i)=='(') st.push('(');
			else {
				st.pop();
				if(n.charAt(i-1)=='(') {

					answer+=st.size();
				}else {

					answer++;
				}
			}
		}


		return answer;
	}



	public static void main(String[] args) {
		쇠막대기 T = new 쇠막대기();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();

		System.out.print(T.solution(n));}}

