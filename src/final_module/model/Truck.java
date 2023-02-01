package final_module.model;

public class Truck extends Vehicle {
    private String tonnage;

    public Truck() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                this.getCode(),
                this.getName(),
                this.getProducer(),
                this.getYear(),
                this.getPower(),
                this.getCublicCapacity(),
                this.getTonnage());
    }

    public Truck(int code, String name, String producer, String year, String power, String cublicCapacity, String tonnage) {
        super(code, name, producer, year, power, cublicCapacity);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tonnage " + tonnage;
    }
}
