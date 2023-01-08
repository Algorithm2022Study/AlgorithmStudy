package 그리디;
import java.util.*;



class Time implements Comparable<Time>{
	public int s,e;
	public Time(int s,int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Time o) {
		if(this.e==o.e) return this.s-o.s; //오름차순
		else return this.e-o.e;
	}
}

public class 회의실배정 {


	public int solution(int n, ArrayList<Time> arr) {
		int answer=0;

		Collections.sort(arr);
		int e = Integer.MIN_VALUE;
		for(Time a: arr) {
			if(a.s>=e) {
				e=a.e;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		회의실배정 T = new 회의실배정();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();

		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<k; i++) {
			int s=kb.nextInt();
			int e=kb.nextInt();
			arr.add(new Time(s,e));
		}

		System.out.println(T.solution(k,arr));

	}}



