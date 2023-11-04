package person.employee.hourly;
import person.employee.Employee;

public class HourlyEmployee extends Employee {

    private int workingHours;
    private int hourRate;

    public HourlyEmployee(String name, int age,int hr) {
        super("Hourly", name, age);
        this.hourRate = hr;
    }

    public int getWorkingHours() {
        return (this.workingHours);
    }

    public int getHourRate () {
        return (this.hourRate);
    }

    
    public void setWorkingHours (int workingHours) {
        this.workingHours = workingHours;
    }
    
    public void setHourRate (int hourRate) {
        this.hourRate = hourRate;
    }
    
    @Override
    public int getSalary() {
        this.salary = this.hourRate * this.workingHours;
        return (this.salary);
    }

    @Override
    public void print_all_details () {
        super.print_all_details();
        System.out.println("HourRate : " + hourRate);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("Salary: " + salary);
    }
}