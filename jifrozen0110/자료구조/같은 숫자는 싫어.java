package 자료구조;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int num = stack.peek();
            if (num != arr[i])
                stack.add(arr[i]);
        }

        int[] answer = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[i] = stack.pop();
            i--;
        }

        return answer;
    }
}