class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public void dfs(int[] num, int target, int depth, int sum) {
        if (depth == num.length) {
            if (target==sum) {
                answer++;
            }
        }

        else {
            dfs(num, target, depth+1, sum+num[depth]);
            dfs(num, target, depth+1, sum-num[depth]);
        }
    }
}