
public class User {
    private int     Identifier;
    private int     balance;
    private String  Name;

    User() {
        this.balance = 0;
        this.Name = "none";
    }

    public void setIdentifier(int Identifier) {
        this.Identifier = Identifier;
    }

    public int getIdentifier () {
        return (this.Identifier);
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
        System.out.println("User ID: " + this.Identifier);
        System.out.println("User Name: " + this.Name);
        System.out.println("User Balance: " + this.balance);
    }
}