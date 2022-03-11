import java.util.Scanner;
import java.util.Random;

public class Wk2_Assignment {
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
            switch (s) {
                case 1:
                    selection[0]++;
                    break;
                case 2:
                    selection[1]++;
                    break;
                case 3:
                    selection[2]++;
                    break;

                default:
                    System.out.println("---上筆測資輸入範圍錯誤，請重新輸入---");
                    ct--;
                    break;
            }
            ct++;
        }
        int maxindex = 0;
        boolean dualMax = false;
        for (int i = 0; i < 3; i++) {
            if (selection[i] >= selection[maxindex]) {
                if (selection[i] == selection[maxindex]) {
                    dualMax = true;
                } else {
                    maxindex = i;
                    dualMax = false;
                }

            }

        }
        monitor.close();
        System.out.println("---票選結果---");
        if (ct > 0) {
            System.out.println("有效投票次數為" + ct);
            System.out.printf("(1)臭豆腐：%d 得票率%.2f\n", selection[0], (double) selection[0] / ct);
            System.out.printf("(2)蚵ㄚ煎：%d 得票率%.2f\n", selection[1], (double) selection[1] / ct);
            System.out.printf("(3)魯 味：%d 得票率%.2f\n", selection[2], (double) selection[2] / ct);
            if (!dualMax) {
                switch (maxindex) {
                    case 0:
                        System.out.print("臭豆腐得票最高");
                        break;
                    case 1:
                        System.out.print("蚵ㄚ煎得票最高");
                        break;
                    case 2:
                        System.out.print("魯 味得票最高");
                        break;
                }
            } else {
                System.out.print("最高票從缺");
            }

        } else {
            System.out.println("--投票次數為零，或程式發生錯誤，無法計算得票率--");
        }
    }
}
