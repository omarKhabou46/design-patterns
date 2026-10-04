package com.springRevision;

import com.springRevision.builder.BankAccountBuilder;

public class Director {

    public static BankAccountBuilder accoutBuilder() {
        return new BankAccountBuilder();
    }
}
