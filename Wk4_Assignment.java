import java.util.Random;
import javax.swing.JOptionPane;

public class Wk4_Assignment {
    public static void main(String[] args) {
        String endtext = "\n要繼續嗎";
        String text1, text2 = "選取一個選項";
        int a, b, c;
        JOptionPane.showConfirmDialog(null, "開始完水果拉霸", "選取一個選項", JOptionPane.YES_NO_CANCEL_OPTION);
        do {
            text1 = "";
            a = spin();
            b = spin();
            c = spin();
            if (a == 0) {
                text1 += "草莓 ";
            } else {
                text1 += "香蕉 ";
            }
            if (b == 0) {
                text1 += "草莓 ";
            } else {
                text1 += "香蕉 ";
            }
            if (c == 0) {
                text1 += "草莓";
            } else {
                text1 += "香蕉";
            }
            if (a == b && b == c) {
                text1 += "\n中了！恭喜,";
            }
            text1 += endtext;
        } while (JOptionPane.showConfirmDialog(null, text1, text2,
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION);
    }

    public static int spin() {
        Random r = new Random();
        int rslt = r.nextInt(2);
        return rslt;
    }
}
