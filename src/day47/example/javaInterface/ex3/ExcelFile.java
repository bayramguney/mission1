package day47.example.javaInterface.ex3;

public class ExcelFile implements ReadFile {

    @Override
    public void connect() {
        System.out.println("connect to Excel");
    }

    @Override
    public void getData() {
        System.out.println("get from Excel");
    }

    @Override
    public void saveData() {
        System.out.println("save to Excel");
    }

    @Override
    public void updateData() {
        System.out.println("update Excel");
    }
}
