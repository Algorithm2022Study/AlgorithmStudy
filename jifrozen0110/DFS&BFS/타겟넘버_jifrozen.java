class Solution {
    static int answer;

    public void dfs(int n, int[] numbers, int count, int target) {
        if (count == numbers.length) {
            if (n == target) {
                answer++;
            }
        } else {
            dfs(n + numbers[count], numbers, count + 1, target);
            dfs(n - numbers[count], numbers, count + 1, target);
        }
    }

    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, numbers, 0, target);

        return answer;
    }
}