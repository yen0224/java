import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Assignment5 {
    public static void main(String[] args) {
        int[] play = new int[6];

        for (int i = 0; i < 6; i++) {
            play[i] = Integer.parseInt(JOptionPane.showInputDialog("請投注第 " + (i + 1) + " 個號碼<1至42>： "));
        }
        Arrays.sort(play);

        int[] lotto = draw(); // 開出六個中獎號碼
        check(play, lotto); // 對獎

    }

    public static int[] draw() { // 可多利用EXE5_3
        // 依需求實作出本方法
        Random r = new Random();
        int lotto[] = new int[6];
        Arrays.fill(lotto, 0);
        int randomnum;
        for (int i = 0; i < 6; i++) {
            randomnum = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[j] == randomnum) {
                    randomnum = r.nextInt(9) + 1;
                    j = 0;
                }
            }
            lotto[i] = randomnum;
        }
        Arrays.sort(lotto);
        return lotto;

    }

    public static void check(int[] ArrayA, int[] ArrayB) {
        Arrays.sort(ArrayA);
        Arrays.sort(ArrayB);
        int prizenum = 0;
        for (int i = 0; i < ArrayA.length; i++) {
            for (int j = 0; j < ArrayB.length; j++) {
                if (ArrayA[i] == ArrayB[j]) {
                    prizenum++;
                } else {
                    continue;
                }
            }
        }
        String message = "";
        message += "中獎號碼為：";
        for (int i = 0; i < ArrayA.length; i++) {
            message += (ArrayA[i] + " ");
        }
        message += "\n您的號碼為：";
        for (int i = 0; i < ArrayB.length; i++) {
            message += (ArrayB[i] + " ");
        }
        switch (prizenum) {
            case 6:
                message += "\n恭喜中了 頭獎！";
                break;
            case 5:
                message += "\n恭喜中了 二獎！";
                break;
            case 4:
                message += "\n恭喜中了 三獎！";
                break;
            case 3:
                message += "\n恭喜中了 四獎！";
                break;
            default:
                message += "\n銘謝惠顧，下次再來！";
                break;
        }
        JOptionPane.showMessageDialog(null, message, "結果", 0);

    }
}
