package case_study.model.facility;

public class Villa extends Facility {
    private String standardVilla;
    private double areaPool;
    private int numberOfFloor;

    public Villa() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getNameService(), this.getIdService(),
                this.getArea(), this.getPrice(), this.getNumberOfPeople(),
                this.getRentalType(), this.getStandardVilla(), this.getAreaPool(), this.getNumberOfFloor());
    }

    public Villa(String nameService, String idService,
                 double area, int price, int numberPeople,
                 String rentalType, String standardVilla, double areaPool,
                 int numberOfFloor) {
        super(nameService, idService, area, price, numberPeople, rentalType);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandard(String standard) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
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
        return super.toString() +
                ", standard: " + standardVilla +
                ", areaPool: " + areaPool +
                ", numberOfFloor: " + numberOfFloor;
    }
}
