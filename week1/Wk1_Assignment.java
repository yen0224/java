import java.util.Scanner;

public class Wk1_Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double rs;
        System.out.print("輸入分子(整數):");
        a = input.nextInt();
        System.out.print("輸入分母(整數):");
        b = input.nextInt();
        rs = (double) (a * a) / (b * b);
        System.out.printf("結果為%.2f", rs);
        input.close();
    }
}
