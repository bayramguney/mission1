package day47.example.javaInterface.ex2;

public class CopyToPowerPoint implements CopyAndPastingToFile {

    public void draw(){

    }

    @Override
    public void copyPaste() {
        System.out.println("copy paste to power point");
    }
}
