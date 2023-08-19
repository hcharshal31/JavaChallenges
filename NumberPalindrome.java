public class NumberPalindrome {
    public static void main(String args[]){
        int number = 1451;
        int temp = number;
        int rem;
        int reverse = 0;
        while(temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(reverse);
        if (number == reverse){
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }
}
