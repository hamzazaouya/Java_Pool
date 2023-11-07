import person.employee.salary.SalariedEmployee;
import person.employee.hourly.HourlyEmployee;

public class Main {
  public static void main(String [] args) {
    SalariedEmployee se1 = new SalariedEmployee("Hamza", 26, 4000);
    se1.setBonus(300);
    se1.setBonus(100);
    se1.setDeductions(50);
    SalariedEmployee se2 = new SalariedEmployee("Amal", 35, 70000);
    se2.setBonus(500);
    se2.setBonus(200);
    se2.setDeductions(300);
    HourlyEmployee he1 = new HourlyEmployee("Karim", 18, 30);
    he1.setWorkingHours(120);
    HourlyEmployee he2 = new HourlyEmployee("Kamal", 40, 45);
    he2.setWorkingHours(75);

    se1.print_all_details();
    System.out.println("----------------------------------");
    se2.print_all_details();
    System.out.println("----------------------------------");
    he1.print_all_details();
    System.out.println("----------------------------------");
    he2.print_all_details();
  }
}
