package 그리디;
import java.util.*;


//그리디 : 지금 최선의 선택
class Body implements Comparable<Body>{
	public int h,w;
	public Body(int h,int w) {
		this.h = h;
		this.w = w;
	}

	//키 순으로 내림차순
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
	}
}

public class 씨름선수 {


	public int solution(int n, ArrayList<Body> arr) {
		int answer=0;

		Collections.sort(arr);
		int max=Integer.MIN_VALUE;
		for(Body o:arr) {
			if(o.w>max) {
				max=o.w;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		씨름선수 T = new 씨름선수();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();

		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<k; i++) {
			int h=kb.nextInt();
			int w=kb.nextInt();
			arr.add(new Body(h,w));
		}

		System.out.println(T.solution(k,arr));

	}}



