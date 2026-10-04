package com.springRevision.builder;

import com.springRevision.model.AccountStatus;
import com.springRevision.model.AccountType;
import com.springRevision.model.BankAccount;

public class BankAccountBuilder {

    private Long id;
    private String currency;
    private double balance;
    private AccountType type;
    private AccountStatus status;

    public BankAccountBuilder id(long id) {
        this.id = id;
        return this;
    }

    public BankAccountBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }

    public BankAccountBuilder type(AccountType type) {
         this.type = type;
         return this;
    }

    public BankAccountBuilder status(AccountStatus status) {
        this.status = status;
        return this;
    }

    public BankAccountBuilder balance(double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccount build() {
        return new BankAccount(id, currency, balance, status, type);
    }



}
