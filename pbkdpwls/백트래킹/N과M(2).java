class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        int tmp = 0;

        for(int i=0;i<numbers.length;i++) {
            tmp = numbers[i];
            if (numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
                answer+="L";
                left = numbers[i];
            }
            else if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
                answer+="R";
                right = numbers[i];
            }
            else {
                if(tmp==0) tmp=11;
                int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;
                if(leftdist<rightdist){
                    answer+="L";
                    left = tmp;
                }else if(leftdist>rightdist){
                    answer+="R";
                    right = tmp;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        left = tmp;
                    }else{
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }
}