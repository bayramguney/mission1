package day44.example;

//it does not work with data member, cannot override the data member,
//but can override the method
public class RuntimePolymorphismWithDataMember {
    public static void main(String args[]) {
        Bike obj = new Honda();

        //method overriding does not work on data member
        System.out.println(obj.speedlimit);//90
        //here method overriding works on methods
        obj.Print();//Honda driving
    }
}

class Bike {
    int speedlimit = 90;
    void Print(){
        System.out.println("Bike driving");
    }
}

class Honda extends Bike {
    int speedlimit = 150;
    void Print(){
        System.out.println("Honda driving");
    }
}


