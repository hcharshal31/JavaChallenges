public class MaxOrMinArrayNumber {
    public static void main(String args[]){
        int[] a = {4, 5, 7, 9, 5, 10, 15};
        int maxOrMin = a[0];
        for (int i = 1; i < a.length; i++){
            if (maxOrMin < a[i]) {
                maxOrMin = a[i];
            }
        }
        System.out.println("The maximum element from given array is "+ maxOrMin);

        for (int i = 0; i < a.length; i++){
            if (maxOrMin > a[i]) {
                maxOrMin = a[i];
            }
        }
        System.out.println("The minmum element from given array is " + maxOrMin);
    }
}
