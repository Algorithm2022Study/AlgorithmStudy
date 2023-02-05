package 그리디;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 큰_수의_법칙 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;

		st=new StringTokenizer(br.readLine());

		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr,Collections.reverseOrder());
		int maxValue=arr[0]*k+arr[1];

		int sum=(m/(k+1))*maxValue+(m%(k+1))*arr[0];
		System.out.println(sum);

	}

}
