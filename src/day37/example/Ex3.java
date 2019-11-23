package day37.example;

import day37.example.objects.Profile;
import day37.example.objects.User;

public class Ex3 {
    public static void main(String[] args) {
        // Created object student
        Profile info = new Profile();
        info.firstName = "Max";
        info.lastName = "Adams";

        User student = new User();
        student.login = "max@techno.study";
        student.password = "pasd12394";
        student.profile = info;
        System.out.println(student);

        System.out.println("---------------------------------------------------");
        // Created object teacher
        User teacher = new User("ali@tech.com", "123", "Ali", "James");
        System.out.println(teacher);
//        System.out.println(student);
    }
}
