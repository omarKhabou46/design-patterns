package com.springRevision.builder;

import com.springRevision.model.AccountStatus;
import com.springRevision.model.AccountType;
import com.springRevision.model.BankAccount;

public class BankAccountBuilder {
    private BankAccount bankAccount = new BankAccount();

    public BankAccountBuilder id(long id) {
        bankAccount.setId(id);
        return this;
    }

    public BankAccountBuilder currency(String currency) {
        bankAccount.setCurrency(currency);
        return this;
    }

    public BankAccountBuilder type(AccountType type) {
        bankAccount.setType(type);
        return this;
    }

    public BankAccountBuilder status(AccountStatus status) {
        bankAccount.setStatus(status);
        return this;
    }

    public BankAccountBuilder balance(double balance) {
        bankAccount.setBalance(balance);
        return this;
    }

    public BankAccount build() {
        return bankAccount;
    }



}
