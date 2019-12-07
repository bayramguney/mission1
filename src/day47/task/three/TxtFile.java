package day47.task.three;

import day47.example.javaInterface.ex3.ReadFile;

public class TxtFile implements ReadFile {

    public void connect() {
        System.out.println( "Connect to Txt" );
    }

    public void getData() {
        System.out.println( "Get from Txt" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to Txt" );
    }

    @Override
    public void updateData() {
        System.out.println( "Update Txt" );
    }
}
