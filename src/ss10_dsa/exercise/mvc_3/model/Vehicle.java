package ss10_dsa.exercise.mvc_3.model;

public class Vehicle {
    private String id;
    private String producer;
    private int year;
    private String owner;

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Vehicle() {
    }

    public Vehicle(String id, String producer, int year, String owner) {
        this.id = id;
        this.producer = producer;
        this.year = year;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
