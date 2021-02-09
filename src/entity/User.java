package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullInfo() {
        return
                "Имя:  " + firstName + " " + lastName + "\n" + "E-mail: " + email;
    }


    public boolean isPasswordCorrect(String z) {
        return this.password.equals(z);

    }
}

