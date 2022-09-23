
import java.util.Scanner;

public class 연속된자연수의합 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		while (end_index != N) {
			if (sum == N) {
				count++;
				end_index++;
				sum += end_index;
			} else if (sum > N) { //왼쪽 값 삭제
				sum -= start_index;
				start_index++;
			} else { //범위 확장
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}
}
