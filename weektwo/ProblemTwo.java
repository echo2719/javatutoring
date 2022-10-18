package weektwo;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int cnt=0;
        for (int i = 1; i<=100; i++) {
            if(i%f==0){
                cnt++;
            }
        }
        System.out.println(f+"의 배수는 "+cnt+"개 입니다.");
    }
}
