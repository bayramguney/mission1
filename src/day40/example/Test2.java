package day40.example;

public class Test2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }


    //read only
    private int id = 42;

    public int getId(){
        return id;
    }
}
