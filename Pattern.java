import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++){
            for (int j = 3; j >= i; j--){
                System.out.print("*   ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i <= 4; i++){
            for(int j = 4 ; j > i; j--){
               System.out.print("   ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i <= 4; i++){
            for(int j = 4 ; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            int x = 0;
            for(int l = 4; l >= i; l--){
                x += 1;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
