package person.employee;
import person.Person;

public class Employee extends Person {
    protected static int id;
    protected int employeeId;
    protected String type;

    public Employee () { 
        this.employeeId = ++id;
    }
    
    public Employee(String name, int age) {
        super(name, age);
        this.employeeId = ++id;
    }

    public int getEmployeeId () {
        return (this.employeeId);
    }

    public static int getTotalEmployee () {
        return (id);
    }

    public void setType (String type) {
        this.type = type;
    }

    public String getType () {
        return this.type;
    }
}