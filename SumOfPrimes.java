public class SumOfPrimes {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;
        int number = 2; // Start checking from 2, the first prime number

        while (count <= 1000) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 1000 prime numbers: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}