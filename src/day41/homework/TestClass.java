package day41.homework;

public class TestClass {
    public static void main(String[] args) {
        Y y = new Y ();
    }
}

class X {
    public X(int i) {
        System.out.println ( 1 );
    }

    public X() {
        System.out.println ( 1 );
    }
}

class Y extends X {
    public Y() {
        super ();
        System.out.println ( 2 );
    }
}
//
//public class TestClass {
//    public static void main(String[] args) {
////        Yellow y = new Yellow ();
////        y.staticMethod ();
//        Yellow.staticMethod ();
//    }
//}
//
//class Xray {
//    static void staticMethod() {
//        System.out.println ( "Class  Xray" );
//    }
//}
//
//class Yellow extends Xray {
//    static void staticMethod() {
//        System.out.println ( "Class Yellow" );
//    }
//}

//public class TestClass5 {
//    public static void main(String[] args) {
//        ConstructorExample ce = new ConstructorExample ();
//        C c = new C ();
//    }
//}
//
//class A {
//    public A() {
//        System.out.println ( "Class A Constructor" );
//    }
//}
//
//class B extends A {
//    public B() {
//        System.out.println ( "Class B Constructor" );
//    }
//}
//
//class C extends B {
//    public C() {
//        System.out.println ( "Class C Constructor" );
//    }
//}
//
////constructor is used to initialize objects.
////it will be invoked/called when we create with new
//class ConstructorExample {
//
//    public ConstructorExample(int key) {
//
//    }
//    public ConstructorExample() {
//        val = 42;
//        System.out.println ( "Constructor called" );
//    }
//    public int val;
//}


////IQ: what is static?, how is it used, why we have to use.
////compiler will go to static first. Debug and you will see.
//public class TestClass4 {
//    public static void main(String[] args) {
//        C c = new C ();
//        StaticInstanceExample s = new StaticInstanceExample ();
//        //s.
//        //how is it used.
//        StaticInstanceExample.val = 45;
//
//        //why we have to use?
//        //when you need to share it among other classes or objects,
//        //without create an instance on a new class.
//    }
//}
//class StaticInstanceExample{
//    static int val = 42;
//}
//class A {
//
//    static {
//        System.out.println ( "THIRD" );
//    }
//}
//
//class B extends A {
//    static {
//        System.out.println ( "SECOND" );
//    }
//}
//
//class C extends B {
//    static {
//        System.out.println ( "FIRST" );
//    }
//}
//

//public class TestClass3 {
//    public static void main(String[] args) {
//
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//}
//
//class A {
//    String s = "Class A";
//}
//
//class B extends A {
//    String s = "Class B";
//    {
//        System.out.println ( super.s );
//    }
//}
//
//class C extends B {
//    String s = "Class C";
//    {
//        System.out.println(super.s);
//    }
//}

//public class TestClass2 {
//    public static void main(String[] args) {
////        C c = new C();
////        A c2 = new C();
////        B b = new C();
////        B b2 = new B();
//        A b3 = new B();
//    }
//}
//
//class A {
//    {
//        System.out.println(1);
//    }
//}
//
//class B extends A {
//    {
//        System.out.println(2);
//    }
//}
//
//class C extends B {
//    {
//        System.out.println(3);
//    }
//}

//
//class TestClass1{
//    public static void main(String[] args) {
//        A a = new B();
//
//        //data members cannot be overridden
//        System.out.println(a.i);
//        //methods can be overridden
//        a.PrintMethod();
//    }
//}
//
//class A {
//    int i = 10;
//    public void PrintMethod()
//    {
//        System.out.println("Printing from class A");
//    }
//}
//
//class B extends A {
//    int i = 20;
//    public void PrintMethod()
//    {
//        System.out.println("Printing from class B");
//    }
//}

//
//interface X {
//    //Class X Members
//}
//
//interface Y {
//    //Class Y Members
//}
//
//class Z implements X, Y {
//    //Class Z Members
//}
//interview question.
//can you inherit multiple classes: NO
//can you inherit multiple interfaces : Yes
//how do we fix it