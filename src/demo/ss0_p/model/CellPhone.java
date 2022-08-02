package demo.ss0_p.model;

public class CellPhone extends Phone {
    private String nation;
    private String status;

    public CellPhone() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getPhoneName(),
                this.getPrice(),
                this.getAmount(),
                this.getProducer(),
                this.getNation(),
                this.getStatus());
    }

    public CellPhone(int id, String phoneName, int price, int amount, String producer, String nation, String status) {
        super(id, phoneName, price, amount, producer);
        this.nation = nation;
        this.status = status;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "nation='" + nation + '\'' +
                ", status='" + status + '\'' +
                super.toString() +
                '}';
    }
}
