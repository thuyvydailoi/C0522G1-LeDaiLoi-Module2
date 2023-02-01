package ss04_oop.exercise.transaction;

public class Transaction {

    private double transactionFree = 0.01;

    //set có điều kiện
    public void setTransactionFree(double transactionFree) {
        if (transactionFree < 0.1 || transactionFree > 0.5) {
            throw new IllegalArgumentException();
        }
        this.transactionFree = transactionFree;
    }

    //public
//        public double transactionFree = 0.01;


    //có đủ set get

//    public double getTransactionFree() {
//        return transactionFree;
//    }
//    public void setTransactionFree(double transactionFree) {
//        this.transactionFree = transactionFree;
//    }




    // chép phạt cho nhớ
    //đặt thêm điều kiện thông qua setter getter => ngắn gọn và đơn giãn hơn.

    public double getMoneyInMonth(int moneyTransfer) {
        return moneyTransfer * transactionFree;
    }
}
