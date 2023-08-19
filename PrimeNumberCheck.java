import java.util.Date;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int wholeNumber = 17;
        int x = 0;
        for(int devisor = 2;devisor < wholeNumber; devisor++) {
            if(wholeNumber==2){
                System.out.println("2 is a prime number");
            } else if (wholeNumber % devisor == 0) {
                x += 1;
            }
        }
        if (x>0){
            System.out.println("The " + wholeNumber + " is a not prime number");
        } else {
            System.out.println("The " + wholeNumber + " is a prime number");
        }

    }
}
