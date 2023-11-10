import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList{
    private TransactionNode transactionList;
    int                     length;

    public TransactionsLinkedList() { 
        transactionList = null;
        length = 0;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        TransactionNode transactionNode = new TransactionNode(transaction);
        TransactionNode tmp = transactionList;

        if(tmp == null) {
            transactionList = transactionNode;
        } else {
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(transactionNode);
        }
        
    }

    @Override
    public void removeTransactionById(UUID Id) throws TransactionNotFoundException{
        TransactionNode tmp = transactionList;
        while(tmp.getNext() != null) {
            if(tmp.getNext().getData().getId().equals(Id)) {
                tmp.setNext(tmp.getNext().getNext());
                return ;
            }
        }
        throw new TransactionNotFoundException("Transaction Not Found");
    }

    @Override
    public Transaction[] toArray () {
        Transaction [] arr = new Transaction[length];
        TransactionNode tmp = transactionList;
        int i = 0;
        while(tmp != null) {
            arr[i++] = tmp.getData();
            tmp = tmp.getNext();
        }
        return (arr);
    }
}