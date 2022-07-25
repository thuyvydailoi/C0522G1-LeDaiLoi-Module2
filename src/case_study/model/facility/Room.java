package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, int area, int price, int numberPeople, int rentalType, String freeService) {
        super(nameService, area, price, numberPeople, rentalType);
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                super.toString() +
                '}';
    }
}
