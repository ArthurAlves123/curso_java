package entities;

public class Account {
    private int acc_number;
    private String acc_holder;
    private double balance;

    public Account(int acc_number, String acc_holder, double initialDeposit) {
        this.acc_number = acc_number;
        this.acc_holder = acc_holder;
        deposit(initialDeposit);
    }
    

    public Account(int acc_number, String acc_holder){
        this.acc_number = acc_number;
        this.acc_holder = acc_holder;
    }

    public int getAccNumber(){
        return acc_number;
    }

    public String getAccHolder(){
        return acc_holder;
    }

    public void setAccHolder(String acc_holder){
        this.acc_holder = acc_holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        balance += value;
    }
    
    public void withdraw(double value){
        balance -= (value + 5.00);
    }
    public String toString(){
        return "Account " + getAccNumber() + ", Holder: " + getAccHolder() + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
