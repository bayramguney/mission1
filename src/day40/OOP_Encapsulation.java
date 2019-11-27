package day40;

public class OOP_Encapsulation {
    // Java OOP(Encapsulation)

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.name = "Techno";
        t1.name = "AnyName";

        Test2 t2 = new Test2();
        t2.setName("Techno");
        String result = t2.getName();

        t2.getAge();


    }
}


