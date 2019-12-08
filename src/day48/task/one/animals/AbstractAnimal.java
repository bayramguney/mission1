package day48.task.one.animals;

public abstract class AbstractAnimal {
    private String breed;
    private double minCal;
    private double maxCal;

    public double getMinCal() {
        return minCal;
    }

    public void setMinCal(double minCal) {
        this.minCal = minCal;
    }

    public double getMaxCal() {
        return maxCal;
    }

    public void setMaxCal(double maxCal) {
        this.maxCal = maxCal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
