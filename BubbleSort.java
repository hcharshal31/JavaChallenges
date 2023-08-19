public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {12, 13, 4, 3, 8, 10};
        int temp;
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        System.out.println(arr);

    }
}
