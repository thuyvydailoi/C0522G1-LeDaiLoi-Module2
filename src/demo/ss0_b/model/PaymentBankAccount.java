package demo.ss0_b.model;

public class PaymentBankAccount extends BankAccount {
    private int numberCard;
    private int moneyInCard;

    public PaymentBankAccount(){
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",this.getId(), this.getName(),
                this.getCode(), this.getDateCreated(),
                this.getNumberCard(), this.getMoneyInCard());
    }

    public PaymentBankAccount(int id, String name,
                              String code, String dateCreated,
                              int numberCard, int moneyInCard) {
        super(id, name, code, dateCreated);
        this.numberCard = numberCard;
        this.moneyInCard = moneyInCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public void setMoneyInCard(int moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getMoneyInCard() {
        return moneyInCard;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cardNumber=" + numberCard +
                ", money=" + moneyInCard;
    }
}
