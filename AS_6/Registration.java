import javax.swing.JOptionPane;

public class Registration {
    public static void main(String[] args) {
        int[] grades = new int[5];
        String name = JOptionPane.showInputDialog("學生姓名");
        String address = JOptionPane.showInputDialog("地址");
        Student s1 = new Student(name, address);
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "成績" + (i + 1));
            grades[i] = Integer.parseInt(input);
        }
        s1.setGrades(grades);
        JOptionPane.showMessageDialog(null, s1);
    }
}