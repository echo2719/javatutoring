package weektwo;

import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp2="";
        int sum = 0;
        while(true){
            System.out.println("주문하시겠습니까(종료하려면0입력)");
            inp2 = sc.next();
            if (inp2.equals("0")){
                break;
            }
            switch(inp2){
                case "아메리카노":sum+=3000;break;
                case "에스프레소":sum+=2500;break;
                case "카푸치노":
                case "카페라떼":
                    sum+=3500;break;
                default:
                    System.out.println("메뉴에 없습니다!");
            }
        }
        System.out.println("주문하신 총 가격은 "+sum+"원 입니다.");
    }
}
