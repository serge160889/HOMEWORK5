package academy.belhard;

import entity.Person;
import entity.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1=new Person("Sergei","Voitehovich");
        User u1=new User("Sergei","Voitehovich","serge_voit_2006@mail.ru","family");
        String p2= p1.getFullName();
        System.out.println(p2);
        String u2= u1.getFullInfo();
        System.out.println(u2);
        boolean e2=u1.isPasswordCorrect("family");
        System.out.println(e2);
        boolean e3= u1.isPasswordCorrect("star");
        System.out.println(e3);

    }
}
