import java.util.Scanner;

public class Program {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("-> ");
    int num = input.nextInt();
    if(num < 2) {
      System.out.println("IllegalArgument");
      System.exit(-1);
    }
    int i = 2;
    while(i * i <= num) {
      if(num % i == 0) {
        System.out.println("   false " + (i - 1));
        System.exit(0);
      }
      i++;
    }
    System.out.println("   true " + (i - 1));
    System.exit(0);
  }
}
