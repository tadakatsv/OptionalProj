package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    public List<User> users = new ArrayList<>();
    public List<User> getData(){
        if(users.isEmpty()){
            users.add(new User("Lesha","pochtovik1945@gmail.com"));
            users.add(new User("Misha","pochtovik1918@gmail.com"));
            users.add(new User("GavriloPrincip","pochtovik1914@gmail.com"));
            users.add(new User("Alex","pochtovik1941@gmail.com"));
        }
        return users;
    }
    public Optional<List<User>> getAllProducts() {
        List<User> list = getData();
        if(list.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(list);
        }
    }
}
