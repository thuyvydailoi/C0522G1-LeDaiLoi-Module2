package ss04_oop.exercise.transaction;

public class TransactionHistory {

    public static void saveTransaction() {
        int moneyTransfer = 1000000;
        Transaction transaction = new Transaction();

        //đầy đủ setter & getter
//        transaction.getTransactionFree();
//        System.out.println(transaction.getMoneyInMonth(moneyTransfer));
//        transaction.setTransactionFree(0.05);
//        System.out.println(transaction.getMoneyInMonth(moneyTransfer));

        //public
//        transaction.transactionFree = 0.03;
//        System.out.println(transaction.getMoneyInMonth(moneyTransfer));



        //Khuyết getter
//        transaction.getTransactionFree();
//        transaction.setTransactionFree();

        //Có điều kiện
        transaction.setTransactionFree(0.5);
        double money = transaction.getMoneyInMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {
        saveTransaction();
    }
}
