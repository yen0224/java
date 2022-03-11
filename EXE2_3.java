import java.util.Scanner;

public class EXE2_3 {
    public static void main(String[] args) {
        Scanner monitor = new Scanner(System.in);
        int ct = 0;
        int selection[] = { 0, 0, 0 };
        while (true) {
            System.out.print("票選最喜歡的小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味 或(-1)退出。請選擇");
            int s = monitor.nextInt();
            if (s == -1) {
                break;
            }
            if (s < 4 && s > 0) {
                selection[s - 1]++;
            } else {
                System.out.println("---上筆測資輸入範圍錯誤，請重新輸入---");
                ct--;
            }
            ct++;
        }
        monitor.close();
        System.out.println("---票選結果---");
        if (ct > 0) {
            System.out.println("有效投票次數為" + ct);
            System.out.printf("(1)臭豆腐：%d 得票率%.1f%%\n", selection[0], (double) selection[0] / 5 * 100);
            System.out.printf("(2)蚵ㄚ煎：%d 得票率%.1f%%\n", selection[1], (double) selection[1] / 5 * 100);
            System.out.printf("(3)魯 味：%d 得票率%.1f%%\n", selection[2], (double) selection[2] / 5 * 100);
        } else {
            System.out.println("--投票次數為零，或程式發生錯誤，無法計算得票率--");
        }
    }
}
