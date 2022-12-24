package stack_queue;
import java.util.*;
//0 1 2 3 4  n=5
public class postfix {
	public int solution(String str) {

		int answer=0;
		//'0' 48 '1' 49 2 50 3 51 4 52 5 53  53-48=5실제 값
		Stack<Integer> st = new Stack<Integer>();
		for(char r: str.toCharArray()) {
			if(Character.isDigit(r)) st.push(r-48);
			else {
				int rt=st.pop();
				int lt=st.pop();
				if(r=='+') {
					st.push(rt+lt);
				} //56 -
				else if(r=='-') {
					st.push(lt-rt);
				}else if(r=='*') {
					st.push(lt*rt);
				}else if(r=='/') {
					st.push(lt/rt);
				}
			}
		}

		answer=st.get(0);

		return answer;
	}



	public static void main(String[] args) {
		postfix T = new postfix();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();

		System.out.print(T.solution(n));}}

