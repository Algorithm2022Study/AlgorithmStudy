package overthename.그리디;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_수묶기 {
	public static  void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		PriorityQueue<Integer> Plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Minus = new PriorityQueue<>();
		int one=0;
		int zero=0;

		//zero,one,양수,음수 분리하기
		for(int i=0; i<N; i++){
			int data = sc.nextInt();
			if(data>1){
				Plus.add(data);}
			else if(data ==1){
				one++;
			}else if(data==0){
				zero++;
			}else{
				Minus.add(data);
			}
		}

		int sum=0;

		//양수 데이터 처리하기
		while(Plus.size()>1){
			int data1= Plus.remove();
			int data2= Plus.remove();
			sum = sum+ data1*data2;
		}
		//양수 데이터 남은하나
		if(!Plus.isEmpty()){
			sum+= Plus.remove();
		}

		//음수 데이터 처리하기
		while(Minus.size()>1){
			int data1= Minus.remove();
			int data2= Minus.remove();
			sum = sum+ data1*data2;
		}
		//남은하나
		if(!Minus.isEmpty()){
			if(zero==0){
				sum+= Minus.remove();
			}
		}

		sum=sum+one;
		System.out.println(sum);
	}
}
