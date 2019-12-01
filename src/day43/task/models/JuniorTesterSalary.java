package day43.task.models;

public class JuniorTesterSalary extends TesterBaseSalary {

    @Override
    public int getSalary() {
        return super.getSalary() - 50_000;
    }
}
