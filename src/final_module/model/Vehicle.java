package final_module.model;

public abstract class Vehicle {

    private int code;
    private String name;
    private String producer;
    private String year;
    private String power;
    private String cublicCapacity;

    public Vehicle() {
    }

    public Vehicle(int code, String name, String producer, String year, String power, String cublicCapacity) {
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.power = power;
        this.cublicCapacity = cublicCapacity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCublicCapacity() {
        return cublicCapacity;
    }

    public void setCublicCapacity(String cublicCapacity) {
        this.cublicCapacity = cublicCapacity;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return
                "code=" + code +
                        ", name " + name +
                        ", producer " + producer +
                        ", year " + year +
                        ", power " + power +
                        ", cublicCapacity " + cublicCapacity;
    }
}
