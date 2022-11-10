import java.util.*;

public class Main {
	public  String solution(String str) {
		String answer="YES";
		//found7, time: study; Yduts; emit, 7Dnuof
		//str=str.replace(",","").replace(";","").replace(":","").toLowerCase().toString();
		//이건 단순 몇가지 부호만 replace되기 때문에 정규식을 사용하여 제거하는 repalceAll을 써야함
		//[^A-Z] ^를 안에넣는거 주의
		str=str.toLowerCase().replaceAll("[^a-z]","");
		//이러면 띄어쓰기도 없어진다. uppercase-> A-Z해야함
		//System.out.println(str);

		String g = new StringBuilder(str).reverse().toString();

		if(!str.equals(g)) {
			answer="NO";
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();
		System.out.print(T.solution(n));

	}

}