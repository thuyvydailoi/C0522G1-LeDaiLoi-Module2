package final_module.model;

public class Register {
    private int registerNumber;
    private String owner;
    private String dateCreated;
    private String id;

    public Register() {
    }

    public Register(int registerNumber, String owner, String dateCreated, String id) {
        this.registerNumber = registerNumber;
        this.owner = owner;
        this.dateCreated = dateCreated;
        this.id = id;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s",
                this.getRegisterNumber(),
                this.getOwner(),
                this.getDateCreated(),
                this.getId());
    }

    @Override
    public String toString() {
        return
                "registerNumber " + registerNumber +
                        ", owner " + owner +
                        ", dateCreated " + dateCreated +
                        ", id " + id;
    }
}
