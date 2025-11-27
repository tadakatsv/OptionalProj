package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println(userController.findUserById(2));
        System.out.println(userController.findUserByMail("pochtovik1945@gmail.com"));
        System.out.println(userController.findAllUsers());
        System.out.println(User.getQuantity());


    }
}
