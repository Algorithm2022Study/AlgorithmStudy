import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')  // '('가 들어갈 차례 - push
                    stack.push('(');
                else{
                    if(stack.isEmpty()) // ')'가 들어갈 차례, 스택이 비어있을경우 - false
                        return false;
                    else
                        stack.pop();    // 현재 )가 들어갈 상태에서 ('(')가 있는경우 - pop
                }
        }

        answer = (stack.isEmpty()) ? true : false;

        return answer;
    }
}