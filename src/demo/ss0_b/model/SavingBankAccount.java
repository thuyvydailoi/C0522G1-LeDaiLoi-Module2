package demo.ss0_b.model;

public class SavingBankAccount extends BankAccount {
    private int saveMoney;
    private String dateSave;
    private double interestRate;
    private int period;

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getId(), this.getName(),
                this.getCode(), this.getDateCreated(), this.getSaveMoney(),
                this.getDateSave(), this.getInterestRate(), this.getPeriod());
    }

    public SavingBankAccount(
            int id,
            String name,
            String code,
            String dateCreated,
            int saveMoney,
            String dateSave,
            double interestRate,
            int period) {
        super(id, name, code, dateCreated);
        this.saveMoney = saveMoney;
        this.dateSave = dateSave;
        this.interestRate = interestRate;
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getDateSave() {
        return dateSave;
    }

    public void setDateSave(String dateSave) {
        this.dateSave = dateSave;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public String toString() {
        return super.toString() +
                "saveMoney=" + saveMoney +
                ", savingsDay='" + dateSave +
                ", interestRate='" + interestRate +
                ", period='" + period;
    }
}
