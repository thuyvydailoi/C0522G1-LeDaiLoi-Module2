package ss10_dsa.exercise.mvc_3.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", model='" + model + '\'' +
                super.toString() +
                '}';
    }

    public Car() {
    }

    public Car(String id, String producer, int year, String owner, int numberOfSeats, String model) {
        super(id, producer, year, owner);
        this.numberOfSeats = numberOfSeats;
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
