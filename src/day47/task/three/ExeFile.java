package day47.task.three;

import day47.example.javaInterface.ex3.ReadFile;

public class ExeFile implements ReadFile {

    public void connect() {
        System.out.println( "Connect to Exe" );
    }

    public void getData() {
        System.out.println( "Get from Exe" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to Exe" );
    }

    @Override
    public void updateData() {
        System.out.println( "Update Exe" );
    }
}
