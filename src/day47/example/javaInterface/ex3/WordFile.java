package day47.example.javaInterface.ex3;

public class WordFile implements ReadFile {

    public void connect() {
        System.out.println( "Connect to Word" );
    }

    public void getData() {
        System.out.println( "Get from Word" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to Word" );
    }

    @Override
    public void updateData() {
        System.out.println( "Update Word" );
    }
}
