package day43.task.models;

public class SeniorTesterSalary extends TesterBaseSalary {

    @Override
    public int getSalary() {
        return super.getSalary() + 100_000;
    }
}
