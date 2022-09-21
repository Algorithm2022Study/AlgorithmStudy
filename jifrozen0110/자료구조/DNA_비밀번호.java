package Two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DNA_비밀번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(br.readLine());

		int N=Integer.parseInt(st.nextToken());

		int M=Integer.parseInt(st.nextToken());

		String str=br.readLine();

		st=new StringTokenizer(br.readLine());

		int[] DNA=new int[4];
		int check=0;

		for(int i=0;i<4;i++){
			DNA[i]=Integer.parseInt(st.nextToken());
			if(DNA[i]==0){
				check++;
			}
		}


		int[] arr=new int[4];
		char[] ch=str.toCharArray();
		for(int i=0;i<M;i++){
			switch(ch[i]){
				case 'A':
					arr[0]++;
					if(arr[0]==DNA[0]){
						check++;
					}
					break;
				case 'C':
					arr[1]++;
					if(arr[1]==DNA[1]){
						check++;
					}
					break;
				case 'G':
					arr[2]++;
					if(arr[2]==DNA[2]){
						check++;
					}
					break;
				case 'T':
					arr[3]++;
					if(arr[3]==DNA[3]){
						check++;
					}
					break;
			}
		}

		int answer=0;
		for(int i=M;i<N;i++){
			int j=i-M;
			if(check==4) answer++;
			switch(ch[j]){
				case 'A':
					if(arr[0]==DNA[0]){
						check--;
					}
					arr[0]--;
					break;
				case 'C':
					if(arr[1]==DNA[1]){
						check--;
					}
					arr[1]--;
					break;
				case 'G':
					if(arr[2]==DNA[2]){
						check--;
					}
					arr[2]--;
					break;
				case 'T':
					if(arr[3]==DNA[3]){
						check--;
					}
					arr[3]--;
					break;
			}

			switch(ch[i]){
				case 'A':
					arr[0]++;
					if(arr[0]==DNA[0]){
						check++;
					}
					break;
				case 'C':
					arr[1]++;
					if(arr[1]==DNA[1]){
						check++;
					}
					break;
				case 'G':
					arr[2]++;
					if(arr[2]==DNA[2]){
						check++;
					}
					break;
				case 'T':
					arr[3]++;
					if(arr[3]==DNA[3]){
						check++;
					}
					break;
			}
		}
		if(check==4){
			answer++;
		}
		System.out.println(answer);

	}
}
