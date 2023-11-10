import java.util.UUID;

public interface TransactionsList {

    public void addTransaction(Transaction transaction);
    public void removeTransactionById(UUID Id) throws TransactionNotFoundException;
    public Transaction[] toArray ();

}