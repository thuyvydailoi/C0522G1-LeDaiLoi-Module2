package case_study.model.facility;

public class House extends Facility {
    private String standardHouse;
    private int numberOfFloors;

    public House() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(), this.getNameService(),
                this.getArea(), this.getPrice(), this.getNumberOfPeople(),
                this.getRentalType(), this.getStandardHouse(), this.getNumberOfFloors());
    }

    public House(String nameService, String idService,
                 double area, int price, int numberPeople,
                 String rentalType, String standardHouse, int numberOfFloors) {
        super(nameService, idService, area, price, numberPeople, rentalType);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandard(String standard) {
        this.standardHouse = standardHouse;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", standard: " + standardHouse +
                ", numberOfFloors: " + numberOfFloors;
    }
}
