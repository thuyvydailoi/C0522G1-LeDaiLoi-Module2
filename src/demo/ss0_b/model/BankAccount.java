package demo.ss0_b.model;

public abstract class BankAccount {
    private int id;
    private String name;
    private String code;
    private String dateCreated;

    public BankAccount() {
    }

    public BankAccount(int id, String name, String code, String dateCreated) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract String getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", data='" + dateCreated + '\'' +
                '}';
    }
}
