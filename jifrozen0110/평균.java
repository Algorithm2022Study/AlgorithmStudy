package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());

		double[] list=new double[N];
		double sum=0;
		double maxValue=0;
		for(int i=0;i<N;i++){
			list[i]=Integer.parseInt(st.nextToken());
			maxValue=Math.max(maxValue,list[i]);
		}

		for(int i=0;i<N;i++){
			sum+=list[i]/maxValue*100;
		}

		System.out.print(sum/N);

	}
}
