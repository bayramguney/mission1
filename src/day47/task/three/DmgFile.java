package day47.task.three;

import day47.example.javaInterface.ex3.ReadFile;

public class DmgFile implements ReadFile {

    public void connect() {
        System.out.println( "Connect to DMG" );
    }

    public void getData() {
        System.out.println( "Get from DMG" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to DMG" );
    }

    @Override
    public void updateData() {
        System.out.println( "Update DMG " );
    }
}
