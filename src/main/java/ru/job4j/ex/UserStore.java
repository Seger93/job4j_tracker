package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Users not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException("Users is not validate");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException u) {
            u.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}


