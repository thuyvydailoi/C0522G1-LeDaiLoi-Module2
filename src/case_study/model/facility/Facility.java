package case_study.model.facility;

public abstract class Facility {
    private String nameService;
    private String idService;
    private double area;
    private int price;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String nameService, String idService, double area, int price, int numberPeople, String rentalType) {
        this.nameService = nameService;
        this.idService = idService;
        this.area = area;
        this.price = price;
        this.numberOfPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "nameService: " + nameService +
                ", idService: " + idService +
                ", area: " + area +
                ", price: " + price +
                ", numberPeople: " + numberOfPeople +
                ", rentalType: " + rentalType;

    }
}
