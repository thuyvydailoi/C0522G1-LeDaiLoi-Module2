package demo.ss0_p.model;

public class GenuinePhone extends Phone {
    private int arrantyPeriod;
    private String warrantyCoverage;

    public GenuinePhone() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getPhoneName(),
                this.getPrice(),
                this.getAmount(),
                this.getProducer(),
                this.getArrantyPeriod(),
                this.getWarrantyCoverage());
    }

    public GenuinePhone(int id, String phoneName, int price, int amount, String producer, int arrantyPeriod, String warrantyCoverage) {
        super(id, phoneName, price, amount, producer);
        this.arrantyPeriod = arrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public int getArrantyPeriod() {
        return arrantyPeriod;
    }

    public void setArrantyPeriod(int arrantyPeriod) {
        this.arrantyPeriod = arrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "GenuinePhone{" +
                "arrantyPeriod='" + arrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                super.toString() +
                '}';
    }
}
