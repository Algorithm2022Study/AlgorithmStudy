class Solution {
    public String solution(String s) {
        String answer = "";
        int check = s.length()/2;
        if (s.length()%2 == 0) {
            answer += s.substring(check-1,check+1);
        }
        else {
            answer = s.substring(check,check+1);
        }
        return answer;
    }
}