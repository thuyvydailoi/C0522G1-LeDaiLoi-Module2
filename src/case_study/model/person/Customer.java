package case_study.model.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getCode(), this.getName(), this.getDateOfBirth(), this.getGender(),
                this.getId(), this.getPhoneNumber(), this.getEmail(), this.getTypeOfGuest(),
                this.getAddress());
    }

    public Customer(String code, String name, String dateOfBirth,
                    String gender, String id, String phoneNumber,
                    String email, String typeOfGuest, String address) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", typeOfGuest: " + typeOfGuest +
                ", address: " + address;
    }
}
