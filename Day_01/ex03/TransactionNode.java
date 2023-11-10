public class TransactionNode {
    
    private Transaction data;
    private TransactionNode next;

    public TransactionNode (Transaction data) {
        this.data = data;
        this.next = null;
    }

    public Transaction getData () {
        return (this.data);
    }

    public TransactionNode getNext () {
        return (this.next);
    }

    public void setNext(TransactionNode next) {
        this.next = next;
    }
}