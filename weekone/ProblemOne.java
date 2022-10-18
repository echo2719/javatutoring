package weekone;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        int what;

        Scanner sc = new Scanner(System.in);

        what = sc.nextInt();
        //90점 이상: A   80점 이상: B   65점 이상: C   그 외: 불합격
        if (what >= 90){
            System.out.println("A");
        } else if (what >= 80) {
            System.out.println("B");
        } else if (what >= 65) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
