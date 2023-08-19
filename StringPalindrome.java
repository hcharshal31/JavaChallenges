public class StringPalindrome {
    public static void main(String args[]){
        String s = "nitin";
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        if (s.equals(rev)){
            System.out.println("This word is palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }
}
