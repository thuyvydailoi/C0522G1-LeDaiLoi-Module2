package case_study.model.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int code, String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String typeOfGuest, String address) {
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
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                super.toString() +
                '}';
    }
}
