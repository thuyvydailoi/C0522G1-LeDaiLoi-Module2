package case_study.model.facility;

import sun.net.spi.nameservice.NameService;

public abstract class Facility {
    private String NameService;
    private int area;
    private int price;
    private int numberPeople;
    private int rentalType;

    public Facility() {
    }

    public Facility(String nameService, int area, int price, int numberPeople, int rentalType) {
        NameService = nameService;
        this.area = area;
        this.price = price;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return NameService;
    }

    public void setNameService(String nameService) {
        NameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "NameService='" + NameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberPeople=" + numberPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
