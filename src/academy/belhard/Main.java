package academy.belhard;

import entity.Person;
import entity.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1=new Person("Sergei","Voitehovich");
        User u1=new User("Sergei","Voitehovich","serge_voit_2006@mail.ru");
        String p2= p1.getFullName();
        System.out.println(p2);
        String u2= u1.getFullInfo();
        System.out.printf(u2);
    }
}
