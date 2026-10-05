package com.springRevision.model;


public class BankAccount implements Cloneable {
    private Long id;
    private String currency;
    private double balance;
    private AccountType type;
    private AccountStatus status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }


    public BankAccount(Long id, String currency, double balance, AccountStatus status, AccountType type) {
        this.id = id;
        this.currency = currency;
        this.balance = balance;
        this.status = status;
        this.type = type;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                ", status=" + status +
                '}';
    }

    @Override
    public BankAccount clone() {
        try {
            return (BankAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
