import java.util.Scanner;

public class Program {
  private static int isPrime(int num) {
    int i = 2;
    if(num < 2) {
      return (0);
    }
    while(i * i < num)
    {
      if(num % i == 0) {
        return (0);
      }
      i++;
    }
    return (1);
  }

  private static int sumOfDigits(int num)
  {
    int sum = 0;
    while(num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return (sum);
  }

  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int result = 0;
    
    int inputNum = 0;
    while(true)
    {
      System.out.print("-> ");
      inputNum = input.nextInt();
      if(inputNum == 42) {
        break ;
      }
      result += isPrime(sumOfDigits(inputNum)); 
    }
    System.out.println("Count of coffee-request - " + result);
  }
}

