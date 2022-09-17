package Two_pointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 수들의_합_5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long start = 1;
		long end = 1;

		long sum = 1;
		long answer = 0;
		while (end <= N) {
			if (sum < N) {
				end++;
				sum += end;
			} else if (sum > N) {
				sum -= start;
				start++;
			} else {
				end++;
				answer++;
				sum += end;
			}
		}

		System.out.println(answer);
	}
}
