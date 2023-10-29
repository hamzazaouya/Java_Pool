package person.employee.salary;
import person.employee.Employee;

public class SalariedEmployee extends Employee {
    private int salary;
    private int bonus;

    public SalariedEmployee () {
        this.salary = 0;
        this.bonus = 0;
        this.type = "Salary";
    }
    public SalariedEmployee (String name, int age, int salary, int bn) {
        super(name, age);
        this.salary = salary;
        this.bonus = bn;
    }

    public int getSalary () {
        return (this.salary);
    }

    public int getBonus () {
        return (this.bonus);
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public void setBonus (int bn) {
        this.bonus += bn;
    }
}