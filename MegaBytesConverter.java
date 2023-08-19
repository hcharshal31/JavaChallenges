public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(4667);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes/1024;
        int remaining =  megaBytes % 1024;
        System.out.println(kiloBytes+"KB = " + megaBytes + "MB and " + remaining + "KB");
    }

}