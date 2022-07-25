package case_study.model.facility;

public class Villla extends Facility {
    private String standard;
    private int areaPool;
    private int numberOfFloor;

    private Villla() {
    }

    public Villla(String nameService, int area, int price, int numberPeople, int rentalType, String standard, int areaPool, int numberOfFloor) {
        super(nameService, area, price, numberPeople, rentalType);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villla{" +
                "standard='" + standard + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloor=" + numberOfFloor +
                super.toString() +
                '}';
    }
}
