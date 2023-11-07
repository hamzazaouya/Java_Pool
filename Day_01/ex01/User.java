
public class User {
    private int     Id;
    private int     balance;
    private String  Name;

    User() {
        this.balance = 0;
        this.Name = "none";
        Id = UserIdsGenerator.getInstance().getId();
    }

    public int getId () {
        return (this.Id);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance () {
        return (this.balance);
    }

    public void setName (String Name) {
        this.Name = Name;
    }

    public String getName () {
        return (this.Name);
    }

    public void printInfo() {
        System.out.println("User ID: " + this.Id);
        System.out.println("User Name: " + this.Name);
        System.out.println("User Balance: " + this.balance);
    }
}