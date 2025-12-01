package app;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        System.out.println("Введіть id юзера якого хочете знайти:");
        int id = scanner.nextInt();
        Optional<User> userById = userController.findUserById(id);
        if (userById.isPresent()) {
            System.out.println("Ось юзер: " + userById.get());}
        else {
            System.out.println("No data");
        }
        System.out.println("Введіть почту юзера якого знайти: ");
        String mail = scanner.next();
        Optional<User> userByMail = userController.findUserByMail(mail);
        if (userByMail.isPresent()) {
            System.out.println(userByMail.get());
        }
        else{
            System.out.println("No data");
        }
        System.out.println("Усі юзери: ");
        Optional<List<User>> allUsers = userController.findAllUsers();
        allUsers.ifPresentOrElse(
                prod ->
                        System.out.println("3) Product: " + prod),
                () ->
                        System.out.println("3) No data.")
        );
        System.out.println("Кількість юзерів: ");
        System.out.println(User.getQuantity());
    }
}
