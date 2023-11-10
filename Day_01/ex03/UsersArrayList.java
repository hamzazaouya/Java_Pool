public class UsersArrayList implements UsersList {


    private User    usersList[];
    private int     usersCounter;

    public UsersArrayList () {
        this.usersList = new User [2];
        usersCounter = 0;
    }

    @Override
    public void addUser(User user) {
        if(usersList.length == usersCounter) {
            User tmpUsersList [] = new User [usersList.length * 2];
            for(int i = 0; i < usersCounter; i++) {
                tmpUsersList[i] = usersList[i];
            }
            usersList = tmpUsersList;
        }
        usersList[usersCounter++] = user;
    }

    @Override
    public User  getUserById(int ID) throws UserNotFoundException{
        for(int i = 0; i < usersCounter; i++) {
            if(usersList[i].getID() == ID) {
                return (usersList[i]);
            }
        }
        throw new UserNotFoundException("User Not Found: Wrong ID");
    }

    @Override
    public User  getUserByIndex(int index) throws UserNotFoundException{
        if(index < usersCounter)
            return (usersList[index]);
        throw new UserNotFoundException("User Not Found: Wrong Index");
    }

    @Override
    public int  getNumberOfUsers() {
        return (usersCounter);
    }

}