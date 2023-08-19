public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(345);
        printConversion(234);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0) {
                return -1;
        } else if (kilometersPerHour>0){
                double mph = kilometersPerHour/1.609;
                System.out.println(Math.round(mph));
        }
        return 0;
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0) {
            System.out.println("Invalid value");
        } else {
            double milesPerHour;
            milesPerHour = kilometersPerHour/1.609;
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h"  );
        }
    }
}