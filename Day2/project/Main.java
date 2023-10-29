import person.employee.salary.SalariedEmployee;
import person.employee.hourly.HourlyEmployee;

public class Main {
  public static void main(String [] args) {
    SalariedEmployee se1 = new SalariedEmployee();
    se1.setName ("Hamza");
    se1.setAge (26);
    se1.setSalary(3000);
    se1.setBonus(300);
    SalariedEmployee se2 = new SalariedEmployee("Amal", 35, 70000, 1000);

    HourlyEmployee he1 = new HourlyEmployee("Karim", 18, 20, 30);
    HourlyEmployee he2 = new HourlyEmployee();

    he2.setName("Kamal");
    he2.setAge(40);
    he2.setHourRate(45);
    he2.setWorkingHours(100);

    System.out.println("Name : " + se1.getName());
    System.out.println("Age : " + se1.getAge());
    System.out.println("Id : " + se1.getEmployeeId());
    System.out.println("Salary : " + se1.getSalary());
    System.out.println("Bonus : " + se1.getBonus());
    System.out.println("----------------------------------");
    System.out.println("Name : " + se2.getName());
    System.out.println("Age : " + se2.getAge());
    System.out.println("Id : " + se2.getEmployeeId());
    System.out.println("Salary : " + se2.getSalary());
    System.out.println("Bonus : " + se2.getBonus());
    System.out.println("----------------------------------");
    System.out.println("Name : " + he1.getName());
    System.out.println("Age : " + he1.getAge());
    System.out.println("Id : " + he1.getEmployeeId());
    System.out.println("HourRate : " + he1.getHourRate());
    System.out.println("Working Hours : " + he1.getWorkingHours());
     System.out.println("----------------------------------");
     System.out.println("Name : " + he2.getName());
    System.out.println("Age : " + he2.getAge());
    System.out.println("Id : " + he2.getEmployeeId());
    System.out.println("HourRate : " + he2.getHourRate());
    System.out.println("Working Hours : " + he2.getWorkingHours());
    
  }
}
