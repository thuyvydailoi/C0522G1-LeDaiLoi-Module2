package demo.ss0_p.model;

public abstract class Phone {
    private int id;
    private String phoneName;
    private int price;
    private int amount;
    private String producer;

    public Phone(){
    }

    public Phone(int id, String phoneName, int price, int amount, String producer) {
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                '}';
    }
}
