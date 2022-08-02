package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(), this.getNameService(),
                this.getArea(), this.getPrice(), this.getNumberOfPeople(),
                this.getRentalType(), this.getFreeService());
    }

    public Room(String nameService, String idService,
                double area, int price, int numberPeople,
                String rentalType, String freeService) {
        super(nameService, idService, area, price, numberPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", freeService: " + freeService;
    }
}
