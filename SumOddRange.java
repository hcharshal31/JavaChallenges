public class SumOddRange {
    public static void main(String args[]){
        System.out.println(isOdd(3));
        System.out.println(sumOdd(3, 334));
    }
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        } else if (number % 2 != 0){
            return true;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        int sumOfOdd = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                sumOfOdd += i;
            }
        }
        return sumOfOdd;
    }

}