package com.enset.paymentProblem;

public class LegacyPaymentAPI {
    public void makeTransaction(double amount, String currency) {
        System.out.println(
                "Transaction de " + amount + " " + currency
        );
    }
}
