package day47.example.javaAbstract;

/*
There are two ways to achieve abstraction in java
1- By Abstract class (0 to 100%) ,
2- By Interface (100%) what does this mean?
 */
public interface AnimalBird {
    //cannot create attribute
    //public int a;

    //cannot create constructor
    //public AnimalBird();

    //cannot create method
    //public void fly(){}

    public abstract void fly();
//    void fly(); public abstract is automatically there


}
