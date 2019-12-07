package day47.example.javaInterface;

import day47.example.javaInterface.ex3.ExcelFile;
import day47.example.javaInterface.ex3.ReadFile;
import day47.example.javaInterface.ex3.WordFile;

public class SimpleDBConnectingApplication {

    public static void main(String[] args) {
        // ReadFile db = new WordFile();
        ReadFile db = new ExcelFile();
        // apache poi

        // 1000 lines of code
        db.connect();
        db.getData();
        db.saveData();
        db.updateData();
    }
}
