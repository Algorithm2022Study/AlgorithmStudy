import java.util.*;
//abcAb
//1
//baAcc

public class Main {
	public  String solution(String n1,String n2) {
		String answer="YES";
		HashMap<Character, Integer> map = new HashMap<>();

		for(char c:n1.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}

		for(char c:n2.toCharArray()) {
			if(!map.containsKey(c)||map.get(c)==0) answer="NO";
			else {
				map.put(c,map.get(c)-1);

			}
		}


		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n1 = kb.next();
		String n2 = kb.next();
		System.out.print(T.solution(n1,n2));

	}


}