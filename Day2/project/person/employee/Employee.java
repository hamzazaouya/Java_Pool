package person.employee;
import person.Person;

public class Employee extends Person {
    protected static int id;
    protected int employeeId;
    protected int salary;
    protected String type;
    
    public Employee(String type, String name, int age) {
        super(name, age);
        this.type = type;
        this.employeeId = ++id;
    }

    public final int getEmployeeId () {
        return (this.employeeId);
    }

    public static int getTotalEmployee () {
        return (id);
    }

    public final void setType (String type) {
        this.type = type;
    }

    public final String getType () {
        return this.type;
    }

    public int getSalary () {
        return (this.salary);
    }

    @Override
    public void print_all_details() {
        super.print_all_details();
        System.out.println("Type : " + type);
        System.out.println("Id : " + id);
    }
}