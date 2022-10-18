package weekone;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        //윤년 조건 : 4로 나누어 떨어지고 100으로 나누어 떨어지지 않는 해. 혹은 400으로 나누어떨어지는 해

        Scanner sc = new Scanner(System.in);
        int what2 = sc.nextInt();
        if(what2%4==0&&what2%100!=0||what2%400==0){
            System.out.println("윤년");
        }
    }
}
