package app;

import java.util.List;
import java.util.Optional;

public class UserController {
    UserRepository userRepository = new UserRepository();

    Optional<User> findUserById(int id){
        Optional<List<User>> optional =
                userRepository.getAllProducts();
        if(optional.isPresent()){
            List<User> userList = optional.get();
            for(User user : userList){
                if(user.getId() == id){
                    return Optional.of(user);
                }
            }
        }
        return Optional.empty();
    }
    Optional<User> findUserByMail(String mail){
        Optional<List<User>> optional =
                userRepository.getAllProducts();
        if(optional.isPresent()){
            List<User> userList = optional.get();
            for(User user : userList){
                if(user.getEmail().equals(mail)){
                    return Optional.of(user);
                }
            }
        }
        return Optional.empty();
    }
    Optional<List<User>> findAllUsers(){
        Optional<List<User>> optional =
                userRepository.getAllProducts();
        if(optional.isPresent()){
            List<User> userList = optional.get();
            return Optional.of(userList);
            }
        return Optional.empty();
        }
    }
//    a. Метод findUserById(int id), який повертає Optional<User> з користувачем за вказаним id.
//    b. Метод findUserByEmail(String email), який повертає Optional<User> з користувачем за вказаною електронною поштою.
//    c. Метод findAllUsers(), який повертає список всіх користувачів у вигляді Optional<List<User>>.

