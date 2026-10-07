package com.enset.paymentProblem;

public class PaymentAdapter implements PaymentService {

    private final LegacyPaymentAPI oldApiPayment;

    public PaymentAdapter(LegacyPaymentAPI oldApiPayment) {
        this.oldApiPayment = oldApiPayment;
    }

    @Override
    public void pay(double amount) {
        oldApiPayment.makeTransaction(amount,  "MAD");
    }
}
