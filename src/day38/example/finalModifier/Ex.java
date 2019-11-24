package day38.example.finalModifier;

class Person{
    public static final String school = "Clifton";
}

public class Ex {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.school);

        System.out.println("-----------------------------");
//        p.school = "Paterson HS";
        System.out.println(p.school);
    }
}
