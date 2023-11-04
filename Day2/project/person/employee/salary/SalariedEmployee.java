package person.employee.salary;
import person.employee.Employee;

public class SalariedEmployee extends Employee {
    private int bonus;
    private int deductions;

    public SalariedEmployee (String name, int age, int salary) {
        super("Salary", name, age);
        this.salary = salary;
        this.deductions = 0;
    }

    
    public int getBonus () {
        return (this.bonus);
    }
    
    public void setBonus (int bn) {
        this.bonus += bn;
    }
    
    public void setDeductions (int deductions) {
        this.deductions += deductions;
    }
    
    public int getDeductions () {
        return (this.deductions);
    }

    @Override
    public int getSalary () {
        return (salary + bonus - deductions);
    }

    @Override
    public void print_all_details() {
        super.print_all_details();
        System.out.println("Bonus : " + bonus);
        System.out.println("Deductions : " + deductions);
        System.out.println("Salary : " + salary);
    }
}