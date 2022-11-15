import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);
        answer += Integer.toString(intArr[0]) +" "+ Integer.toString(intArr[arr.length-1]);

        return answer;
    }
}