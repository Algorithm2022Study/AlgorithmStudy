import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int[] list = new int[num2 + 1];

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= num2; i++) {
            if (list[i] == 0) {
                if (i >= num1) {
                    sb.append(i).append("\n");
                }
                for (int j = i; j <= num2; j = j + i) {
                    list[j] = 1;
                }
            }
        }

        System.out.println(sb);

    }
}
