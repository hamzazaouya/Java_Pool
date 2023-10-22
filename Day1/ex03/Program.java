import java.util.Scanner;

public class Program {
  private static void printGrades(int grades)
  {
    int reverseGrade = 0;
    int week = 1;
    while(grades != 0)
    {
      reverseGrade = reverseGrade * 10 + grades % 10;
      grades = grades / 10;
    }
    while(reverseGrade != 0)
    {
      int grade = reverseGrade % 10;
      System.out.print("Week " + week++ + " ");
      for(int i = 0; i < grade; i++)
      {
        System.out.print("=");
      }
      System.out.println(">");
      reverseGrade /= 10;
    }
  }
  public static void main(String [] args) {
    int week = 1;
    int grades = 0;
    int inputGrade;
    int inputWeek;
    String inputLine;
    Scanner sc = new Scanner(System.in);
    while (week <= 18)
    {
      System.out.print("-> ");
      inputLine = sc.next();
      if (inputLine.equals("42"))
        break;
      inputWeek = sc.nextInt();
      if (inputLine.equals("Week") && inputWeek == week) {
        System.out.print("-> ");
        int minGrade = 9;
        for (int i = 0; i < 5; i++)
        {
          inputGrade = sc.nextInt();
          if (inputGrade < 0 || inputGrade > 9)
          {
            System.out.print("IllegalArgument");
            System.exit(-1);
          }
          if(minGrade > inputGrade) {
            minGrade = inputGrade;
          }
        }
        grades = grades * 10 + minGrade;
      } else {
        System.out.println("IllegalArgument");
        System.exit(-1);
      }
      week++;
    }
    printGrades(grades);
  }
}
