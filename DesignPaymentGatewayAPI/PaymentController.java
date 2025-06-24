package com.DesignPaymentGatewayAPI;

public class PaymentController {
    public final static PaymentController instance = new PaymentController();

    public void Paymentservice() {
    }

    public static PaymentController getInstance() {
        return instance;
    }

    public boolean handlePayment(GatewayType type, PaymentRequest request) {
        PaymentGateway paymentGateway = GatewayFactory.getInstance().getGateways(type);
        PaymentService.getinstance().setGateway(paymentGateway);
        return PaymentService.getinstance().processPayment(request);

    }
    public static void main(String[] args) {
        PaymentRequest req1 = new PaymentRequest("Nikhil Sharma", "Pankaj Sharma", "INR", 20000d);
        PaymentController.getInstance().handlePayment(GatewayType.PAYTM, req1);

        PaymentRequest req2 = new PaymentRequest("Nikhil Sharma", "Pankaj Sharma", "CAD", 20000d);
        PaymentController.getInstance().handlePayment(GatewayType.RAZORPAY, req2);
    }

}
