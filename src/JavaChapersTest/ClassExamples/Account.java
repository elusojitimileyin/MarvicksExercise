package JavaChapersTest.ClassExamples;

public class Account {
    private int  id;
    private double balance;
    private int transactionCount;


    public Account(int  id, double balance, int transactionCount) {
        this.id = id;
        this.balance = balance;
        this.transactionCount = transactionCount;
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public String toString() {
        return "Account{" +
                "name='" + id + '\'' +
                ", balance=" + balance +
                ", transactionCount=" + transactionCount +
                '}';
    }
}
