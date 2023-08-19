public class NumberOfDaysInMonth {
    public static void main(String args[]){
        System.out.println(isLeapYear(1401));
        System.out.println(getDaysInMonth(2, 400));

    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999 ){
            if (year % 4 == 0){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1){
            System.out.println(-1);
        }
        switch (month){
            case 1:
                System.out.println(31);
                break;
            case 2:
                if (year % 4 == 0){
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("Other");
                break;
            }
        return month;
    }

}

