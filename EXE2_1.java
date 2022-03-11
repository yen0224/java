import java.util.Scanner;

public class EXE2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入貴賓大名:");
        String name = input.nextLine();
        System.out.print("票選最喜歡的小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇");
        int sel = input.nextInt();
        input.close();
        if (sel == 1) {
            System.out.printf("%s選%s", name, "臭豆腐");
        } else if (sel == 2) {
            System.out.printf("%s選%s", name, "蚵ㄚ煎");
        } else if (sel == 3) {
            System.out.printf("%s選%s", name, "滷味");
        }
    }
}