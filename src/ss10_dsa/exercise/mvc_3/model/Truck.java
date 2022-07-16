package ss10_dsa.exercise.mvc_3.model;

public class Truck extends Vehicle {
    private String loadWeight;

    @Override
    public String toString() {
        return "Truck{" +
                "loadWeight='" + loadWeight + '\'' +
                super.toString() +
                '}';
    }

    public Truck(String id, String producer, int year, String owner, String loadWeight) {
        super(id, producer, year, owner);
        this.loadWeight = loadWeight;
    }

    public String getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(String loadWeight) {
        this.loadWeight = loadWeight;
    }
}
