package stack_queue;
import java.util.*;
//0 1 2 3 4  n=5
public class 올바른괄호 {
	public String solution(String n) {

		Stack<Character> st = new Stack<Character>();
		String answer="YES";
		String[] list = n.split("");
		for(char a : n.toCharArray()) {
			if(a=='(') {
				st.push('(');
			}else {
				//)빼려고 하니 스택이 비어있을 때
				//아니면 pop
				if(st.isEmpty()) { answer="NO";}
				else st.pop();
			}
		}
		//stack에 남아 있으면 no
		if(!st.isEmpty()) answer="NO";

		return answer;
	}



	public static void main(String[] args) {
		올바른괄호 T = new 올바른괄호();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();


		System.out.print(T.solution(n));}}

