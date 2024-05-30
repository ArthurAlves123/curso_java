package entities;

import exceptions.BusinessException;

public class Account {
    private Integer acc_number;
    private String acc_holder;
    private Double acc_balance;
    private Double withdrawLimit;

    public Account(){

    }
    public Account(Integer acc_number, String acc_holder, Double acc_balance, Double withdrawLimit) {
        this.acc_number = acc_number;
        this.acc_holder = acc_holder;
        this.acc_balance = acc_balance;
        this.withdrawLimit = withdrawLimit;
    }
    public Integer getAcc_number() {
        return acc_number;
    }
    public void setAcc_number(Integer acc_number) {
        this.acc_number = acc_number;
    }
    public String getAcc_holder() {
        return acc_holder;
    }
    public void setAcc_holder(String acc_holder) {
        this.acc_holder = acc_holder;
    }
    public Double getAcc_balance() {
        return acc_balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        acc_balance += amount;
    }

    public void withdraw(double amount){
        withdrawValidation(amount);
        acc_balance -= amount;

    }
    private void withdrawValidation(double amount) throws BusinessException{
        if (amount > getAcc_balance()) {
            throw new BusinessException("Not enough balance");
        }
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("The amount exceeds withdraw limit");
        }
    }
}
