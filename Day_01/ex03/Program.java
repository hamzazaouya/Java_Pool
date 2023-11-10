public class Program {
    public static void main(String [] args) {
        User u1 = new User();
        u1.setName("Hamza");
        u1.setBalance(100);
        User u2 = new User();
        u2.setName("Karim");
        u2.setBalance(200);
        User u3 = new User();
        u3.setName("Yossra");
        u3.setBalance(150);

        Transaction t1 = new Transaction();
        t1.setSender(u1);
        t1.setRecipient(u2);
        t1.setAmount(50);
        t1.setCategory("Credit");
    }
}