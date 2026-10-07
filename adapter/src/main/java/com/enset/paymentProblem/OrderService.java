package com.enset.paymentProblem;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payOrder(double amount) {
        paymentService.pay(amount);
    }
}
