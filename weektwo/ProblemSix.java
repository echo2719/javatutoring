package weektwo;

public class ProblemSix {
    public static void main(String[] args) {
        // 달력 출력시 이렇게 하라!!
        int yoil = 7;
        for (int i = 1; i < yoil; i++) System.out.print("   ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%3d",i);
            yoil++;
            if (yoil>7){
                yoil = 1;
                System.out.println();
            }
        }
    }
}
