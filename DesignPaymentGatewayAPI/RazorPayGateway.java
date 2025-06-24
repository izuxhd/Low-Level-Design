package com.DesignPaymentGatewayAPI;

public class RazorPayGateway extends  PaymentGateway{
    public   RazorPayGateway(){
         bankingSystem=new RazorpayBankingSystem();

    }
    @Override
    public boolean initiatePayment(PaymentRequest request) {
        System.out.println("[RazorPay] Intiating payment of "+request.sender+"  .\n"+" currency :"+request.currency+" for "+request.sender+"\n");
        return bankingSystem.processPayment(request.amount);
    }

    @Override
    public boolean validatePayment(PaymentRequest request) {
        System.out.println("[Razorpay] validating payment of "+request.amount);
        if(request.amount<=0 ){
            return false;
        }
        return true;
    }

    @Override
    public boolean confirmPayment(PaymentRequest request) {
        System.out.println("[RazorPay] COnfriming payment  of :"+request.sender+"\n");
        return true;
    }
}
