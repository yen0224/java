import java.util.Scanner;

public class EXE1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, f;
        System.out.print("請輸入攝氏溫標（小數一位）");
        c = input.nextDouble();
        input.close();
        f = c * 9 / 5 + 32;
        System.out.printf("轉換後的華氏溫標為%.1f", f);
    }
}
