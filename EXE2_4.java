
//import Random and Scanner class
import java.util.Random;
import java.util.Scanner;

public class EXE2_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            int rsl = a * b;
            System.out.printf("a=%d,b=%d,result=?", a, b);
            if (s.nextInt() != rsl) {
                flag = false;
            }
        }
        System.out.println(flag ? "答對了" : "答錯了");

    }
}
