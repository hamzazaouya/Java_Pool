public class Program {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setName("Ahmed");
        u1.setIdentifier(1);
        u1.setBalance(200);
        u1.printInfo();
        System.out.println("=========================");
    
        User u2 = new User();
        u2.setName("Karim");
        u2.setIdentifier(2);
        u2.setBalance(100);
        u2.printInfo();
        System.out.println("=========================");

        Transaction t1 = new Transaction();
        t1.setSender(u1);
        t1.setRecipient(u2);
        t1.setCategory("Credit");
        t1.setAmount(100);
        t1.printInfo();
        
    }
}