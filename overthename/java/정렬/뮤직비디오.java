package 정렬;
import java.util.*;



public class 뮤직비디오 {
	public int count(int[] arr,int capacity) {
		int cnt=1,sum=0;
		for(int x: arr) {
			if(sum+x > capacity) {
				cnt++;
				sum=x;
			}
			else sum+=x;
		}
		return cnt;

	}

	public int solution(int size,int n, int[] arr) {
		int answer=0;

		int lt=Arrays.stream(arr).max().getAsInt();
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(arr,mid)<=n) {
				answer=mid;
				rt=mid-1;
			}
			else lt=mid+1;
		}


		return answer;
	}

	public static void main(String[] args) {
		뮤직비디오 T = new 뮤직비디오();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();
		int n = kb.nextInt();
		int a[] =new int[k];
		for(int i=0; i<k; i++) {
			a[i]= kb.nextInt();
		}

		System.out.println(T.solution(k, n, a));

	}}



