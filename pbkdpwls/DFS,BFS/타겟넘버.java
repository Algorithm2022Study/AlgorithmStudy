class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        dfs(0, 0, target, numbers);

        return answer;
    }
    public void dfs(int depth, int temp, int target, int[] numbers) {
        if (temp==target && depth==numbers.length) {
            answer++;
        }
        if(depth<numbers.length) {
            dfs(depth+1,temp-numbers[depth], target, numbers);
            dfs(depth+1,temp+numbers[depth], target, numbers);
        }
    }
}