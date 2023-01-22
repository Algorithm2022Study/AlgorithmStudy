import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        long factorial = 1;
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            p.add(i);
        }

        int i = 0;

        k--;
        while (n > 0) {
            factorial /= n;
            int num = (int) (k / factorial);
            answer[i++] = p.get(num);
            p.remove(num);
            k %= factorial;
            n--;
        }

        return answer;
    }
}