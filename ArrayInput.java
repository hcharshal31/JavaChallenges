import java.util.Scanner;

public class ArrayInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : " );
        int number = sc.nextInt();
        System.out.println("the length of the given array is " + number);
        int[] arr = new int[number];
        System.out.print("Enter the array element : " );
        for (int i = 0; i < number; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is as follows : ");
        for (int i = 0; i < number; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
