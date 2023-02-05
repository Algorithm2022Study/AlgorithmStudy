package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자_카드_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;

		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());

		int answer=0;
		for(int i=0;i<n;i++){
			int minValue=(int) 1e9;
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++){
				int value=Integer.parseInt(st.nextToken());
				if(minValue>value){
					minValue=value;
				}
			}
			if(answer<minValue){
				answer=minValue;
			}
		}

		System.out.println(answer);
	}
}
