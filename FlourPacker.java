public class FlourPacker {
    public static void main(String args[]){
        System.out.println(canPack(0,2,6));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        smallCount *= 1;
        int sum = bigCount + smallCount;
        if(bigCount <= goal && sum <= goal &&  smallCount <= goal){
            return true;
        } else {
            return false;
        }

    }
}
