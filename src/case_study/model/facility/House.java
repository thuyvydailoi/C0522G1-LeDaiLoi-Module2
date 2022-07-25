package case_study.model.facility;

public class House extends Facility {
    private String standard;
    private int numberOfFloors;

    public House() {
    }

    public House(String nameService, int area, int price, int numberPeople, int rentalType, String standard, int numberOfFloors) {
        super(nameService, area, price, numberPeople, rentalType);
        this.standard = standard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                super.toString() +
                '}';
    }
}
