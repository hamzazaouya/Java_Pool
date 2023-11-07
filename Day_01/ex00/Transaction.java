
import java.util.UUID;

public class Transaction {
    private final UUID  id;
    private User        recipient;
    private User        sender;
    private String      category;
    private int         Amount;

    public Transaction () {
        this.id = UUID.randomUUID();
    }

    public void setRecipient (User recipient) {
        this.recipient = recipient;
    }

    public User getRecipient () {
        return (this.recipient);
    }

    public void setSender (User sender) {
        this.sender = sender;
    }

    public User getSender () {
        return (this.sender);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory () {
        return (this.category);
    }

    public boolean setAmount (int Amount) {
        this.Amount = Amount;
        if(sender.getBalance()  - this.Amount >= 0) {
            sender.setBalance(sender.getBalance() - this.Amount);
            recipient.setBalance(recipient.getBalance() + this.Amount);
            return (true);
        } else {
            System.out.println("Operation cannot be performed");
            return (false);
        }
    }

    public int getAmount () {
        return (this.Amount);
    }

    public void printInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Category : " + this.category);
        System.out.println("Amount : " + this.Amount);
        System.out.println("------");
        sender.printInfo();
        System.out.println("------");
        recipient.printInfo();
    }
}