package main;
import java.util.*;

public class Main {
	public  char solution(int n,String str) {
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();

		for(char a: str.toCharArray()) {
			map.put(a, map.getOrDefault(a,0)+1);
		}
		//System.out.println(map.containsKey('F'));
		//map.size());
		//map.remove('C');

		int max=Integer.MIN_VALUE;
		for(char a: map.keySet()) {
			if(map.get(a)>max)
			{max=map.get(a);
				answer=a;

			}
		}


		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		String n = kb.next();
		System.out.print(T.solution(s,n));

	}


}
