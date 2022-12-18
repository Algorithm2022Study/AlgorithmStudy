package overthename.그리디;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1541_잃어버린괄호 {
	static int result=0;
	public static  void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String list = sc.nextLine();

		// '-'기준으로 나누기
		String[] str = list.split("-");

		for(int i=0; i<str.length; i++){
			int temp = getSum(str[i]);
			if(i==0)
				result += temp;
			else
				result -= temp;
			}
		System.out.println(result);
	}

	static int getSum(String a){
		int sum=0;
		// '+'기준으로 나누기
		String temp[] = a.split("[+]");
		for(int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
