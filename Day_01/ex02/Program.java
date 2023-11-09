public class Program {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setName("Hamza");
        u1.setBalance(200);

        User u2 = new User();
        u2.setName("Ayoub");
        u2.setBalance(300);

        User u3 = new User();
        u3.setName("Alan");
        u3.setBalance(100);

        UsersArrayList usersList = new UsersArrayList();
        usersList.addUser(u1);
        usersList.addUser(u2);
        usersList.addUser(u3);

        try {
            usersList.getNumberOfUsers();
            User getu1 = usersList.getUserById(u1.getID());
            getu1.printInfo();
            User getu2 = usersList.getUserById(u2.getID());
            getu2.printInfo();
            User getu3 = usersList.getUserByIndex(2);
            getu3.printInfo();
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            User u4 = new User();
            usersList.getUserById(u4.getID());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            usersList.getUserByIndex(3);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}