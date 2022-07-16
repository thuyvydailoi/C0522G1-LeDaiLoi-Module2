package ss10_dsa.exercise.mvc_3.model;

public class Moto extends Vehicle {
    private String wattage;

    @Override
    public String toString() {
        return "Motocycle{" +
                "wattage='" + wattage + '\'' +
                super.toString() +
                '}';
    }

    public Moto(String id, String producer, int year, String owner, String wattage) {
        super(id, producer, year, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }
}
