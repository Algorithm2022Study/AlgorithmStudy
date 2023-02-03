package 이진탐색;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드 {
	static int n;
	static int[] arr;
	private static boolean bin(int target){
		int start=0;
		int end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]<target) start=mid+1;
			else if(arr[mid]==target) return true;
			else end=mid-1;
		}
		return false;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());

		arr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());

		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int m=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++){
			int target=Integer.parseInt(st.nextToken());
			if(bin(target)){
				System.out.print(1+" ");
			}else{
				System.out.print(0+" ");
			}
		}

	}
}
