public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    private int id;

    private UserIdsGenerator() {}

    public static UserIdsGenerator getInstance() {
        if(instance == null) {
            System.out.println("first time");
            instance = new UserIdsGenerator();
        }
        return (instance);
    }

    public int getId () {
        return (++this.id);
    }
}