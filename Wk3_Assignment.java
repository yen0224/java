import java.util.Scanner;


public class Wk3_Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 0; i < side; i++) {
            if(i==0||i==side-1){
                for (int j = 0; j < side; j++) {
                    System.out.print("口");
                }
            }
            else{
            for(int j=0;j<side;j++){
                if(j==0||j==side-1){
                    System.out.print("口");
                }
                else{
                    System.out.print("  ");
                }
            }}
            System.out.println();
        }


        s.close();
    }
}
