package day47.task.three;

import day47.example.javaInterface.ex3.ExcelFile;
import day47.example.javaInterface.ex3.ReadFile;

public class Task {
    // add files below to connect, read, save and update date using ReadFile in ex3
    // 1. TxtFile
    // 2. PowerPointFile
    // 3. DMGFile //Definition of: DMG. DMG. (Disk iMaGe) The file format used in the Mac for distributing software.
    // 4. EXEFile // EXE is a file extension for an executable file format.

    public static void main(String[] args) {
        // ReadFile file = new WordFile();
        ReadFile file = new PowerPointFile();
        // apache poi


        doSomethingWithFile( file );

    }

    // doing so much with this file
    private static void doSomethingWithFile(ReadFile file) {
        // 1000 lines of code
        file.connect();
        file.getData();
        file.saveData();
        file.updateData();
    }
}
