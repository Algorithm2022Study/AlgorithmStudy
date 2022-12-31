package 정렬;
import java.util.*;

class location implements Comparable<location>{
	public int x;
	public int y;
	public location(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(location o) {
		if(this.x==o.x) {return this.y-o.y;}
		else { return this.x - o.x;}
	}

}


public class 좌표정렬 {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();
		ArrayList<location> arr = new ArrayList<location>();
		for(int i=0; i<k;i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr.add(new location(a,b));
		}

		Collections.sort(arr); //comparto 를 기준으로 정렬이 된다

		for(location i : arr) {
			System.out.println(i.x+" "+i.y);}}
}


