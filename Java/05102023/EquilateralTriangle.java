import java.util.Scanner;
public class EquilateralTriangle{
    public static void main(String[] args) {
        int n = 10;
        for(int row=0; row<n; row++){
            for(int col=n-1; col>row; col--){
                System.out.print(" ");
            }
            for(int col=0; col<row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}