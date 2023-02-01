package final_module.model;

public class Oto extends Vehicle {
    private String numberOfSeats;
    private String engineType;

    public Oto() {
    }

    public Oto(int code,
               String name,
               String producer,
               String year,
               String power,
               String cublicCapacity,
               String numberOfSeats,
               String engineType) {
        super(code, name, producer, year, power, cublicCapacity);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }


    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                this.getCode(),
                this.getName(),
                this.getProducer(),
                this.getYear(),
                this.getPower(),
                this.getCublicCapacity(),
                this.getNumberOfSeats(),
                this.getEngineType());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tonnage" + numberOfSeats;
    }
}
