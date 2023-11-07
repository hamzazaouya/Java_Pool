package person;

public class Person {

    protected String name;
    protected int age;
    
    
    public Person () {
        this.name = "None";
        this.age = 0;  
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return (this.name);
    }

    public final int getAge() {
        return (this.age);
    }

    public void print_all_details () {
        System.out.println("Name : \033[0;32m " + this.name + "\033[0m");
        System.out.println("Age : " + this.age);
    }
}
