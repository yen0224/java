import java.util.Scanner;

public class EXE2_2 {
    public static void main(String[] args) {
        Scanner monitor = new Scanner(System.in);
        int ct = 0;
        int selection[] = { 0, 0, 0 };
        while (ct < 5) {
            System.out.print("票選最喜歡的小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇");
            int s = monitor.nextInt();
            if (s < 4 && s > 0) {
                selection[s - 1]++;
            }
            /*
             * switch (s) {
             * case 1:
             * selection[0]++;
             * break;
             * case 2:
             * selection[1]++;
             * break;
             * case 3:
             * selection[2]++;
             * break;
             * }
             */
            ct++;
        }
        monitor.close();
        System.out.println("票選結果");
        ct = 0;
        System.out.printf("(1)臭豆腐：%d 得票率%.1f%%\n", selection[0], (double) selection[0] / 5 * 100);
        System.out.printf("(2)蚵ㄚ煎：%d 得票率%.1f%%\n", selection[1], (double) selection[1] / 5 * 100);
        System.out.printf("(3)魯 味：%d 得票率%.1f%%\n", selection[2], (double) selection[2] / 5 * 100);
    }
}
