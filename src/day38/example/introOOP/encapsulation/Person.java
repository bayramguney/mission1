package day38.example.introOOP.encapsulation;

public class Person {
    private String name;
    private int age;

    public void setAge(int n){
        if(age < 10){
            System.out.println("you are not allowed");
        }else {
            System.out.println("you are allowed");
        }
        age = n;
    }

    public int getAge(){
        return age;
    }












    public void setName(String n){
        // if you are admin, then you can change,
        // otherwise do nothing
        name = n;
    }

    public String getName(){
        return name;
    }
}
