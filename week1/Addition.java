import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        input.close();
        System.out.printf("The sum of %.1f and %.1f is %.1f", num1, num2, num1 + num2);
    }
}
