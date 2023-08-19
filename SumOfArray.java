public class SumOfArray {
    public static void main(String args[]) {
        int[] a = {4, 5, 7, 9, 5, 10, 15};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("The sum of all the elements in a given array is : " + sum);

        int max = a[0];;
        for (int i = 0; i < a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println("The largest element in a given arrray is : " + max);

        int min = a[0];
        for(int i = 0; i < a.length; i++){
           if (min > a[i]){
              min = a[i];
           }
        }
        System.out.println("The smallest element in a given array is : "+ min );
    }
}

