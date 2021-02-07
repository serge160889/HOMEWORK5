package entity;

public class User extends Person{
     private String email;
     private String password;

    public User(String firstName, String lastName, String email) {
        super(firstName, lastName);
        this.email = email;
    }
    public String getFullInfo(){
        return
                "Имя:  "+firstName+" "
                  +lastName+"\n"+
                "E-mail: "+email;
    }

}
