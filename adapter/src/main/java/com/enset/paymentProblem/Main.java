package com.enset.paymentProblem;

public class Main {
    static void main() {
      PaymentAdapter paymentAdapter = new PaymentAdapter(new LegacyPaymentAPI());
      OrderService orderService = new OrderService(paymentAdapter);
      orderService.payOrder(20000);
    }
}
