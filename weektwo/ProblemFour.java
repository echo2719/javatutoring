package weektwo;

import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int price=0;
        switch (inp) {
            case "아메리카노":price=3000;break;
            case "에스프레소":price=2500;break;
            case "카푸치노":
            case "카페라떼":
                price=3500;break;
        }
//        switch (inp) {
//            case "아메리카노" -> price = 3000;
//            case "에스프레소" -> price = 2500;
//            case "카푸치노", "카페라떼" -> price = 3500;
//        }
    }
}
