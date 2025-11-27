package app;

public class User {
    private final int id;
    private String name;
    private String email;
    private static int quantity;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getQuantity() {
        return quantity;
    }

    public User(String name, String email) {
        this.id = quantity++;
        this.name = name;
        this.email = email;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}' + "\n";
    }
}
