public class NumberToWord {
    public static void main(String args[]){
        printNumberInWord(15);

    }
    public static void printNumberInWord(int number){
      switch(number){
          case 1:
             System.out.println("one");
              break;
          case 2:
              System.out.println("Two");
              break;
          case 3:
              System.out.println("Three");
              break;
          case 4:
              System.out.println("Four");
              break;
          case 5:
              System.out.println("Five");
              break;
          case 6:
              System.out.println("Six");
              break;
          case 7:
              System.out.println("Seven");
              break;
          case 8:
              System.out.println("Eight");
              break;
          case 15:
              System.out.println("Fifteen");
              break;
          default:
              System.out.println("Other");
              break;
      }
    }
}
