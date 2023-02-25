import java.util.*;
public class losing_bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int answer = 0;

        String minus[] = str.split("-");

        for (int i=0;i<minus.length;i++) {
            String plus[] = minus[i].split("\\+");
            int temp = 0;
            for(int j=0;j<plus.length;j++) {
                temp += Integer.parseInt(plus[j]);
            }
            if(i==0){
                if(str.charAt(0)=='-'){
                    answer -= temp;
                }
                else{
                    answer += temp;
                }
            }
            else {
                answer -= temp;
            }
        }

        System.out.println(answer);
    }
}
