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

    public String getName() {
        return (this.name);
    }

    public int getAge() {
        return (this.age);
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }
}
