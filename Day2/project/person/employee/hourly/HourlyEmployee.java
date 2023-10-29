package person.employee.hourly;
import person.employee.Employee;

public class HourlyEmployee extends Employee {

    private int workingHours;
    private int hourRate;
    private int salary;

    public HourlyEmployee () {
        workingHours = 0;
        hourRate = 0;
        this.type = "Hourly";
    }

    public HourlyEmployee(String name, int age, int wh, int hr) {
        super(name, age);
        this.workingHours = wh;
        this.hourRate = hr;
    }

    public int getWorkingHours() {
        return (this.workingHours);
    }

    public int getHourRate () {
        return (this.hourRate);
    }

    public int getSalary() {
        return (this.salary);
    }

    public void setWorkingHours (int workingHours) {
        this.workingHours = workingHours;
    }

    public void setHourRate (int hourRate) {
        this.hourRate = hourRate;
    }

}