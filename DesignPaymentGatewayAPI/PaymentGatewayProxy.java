package com.DesignPaymentGatewayAPI;

public class PaymentGatewayProxy extends  PaymentGateway {
    PaymentGateway relPaymentGateway;
     Integer retries;
     public PaymentGatewayProxy(int maxtries,PaymentGateway paymentGateway){
         this.retries=maxtries;
         this.relPaymentGateway=paymentGateway;
     }

    public boolean processPayment(PaymentRequest request){
    boolean result=false;
    for(int   attempt=0;attempt<retries;++attempt) {
        if (attempt > 0) {
            System.out.println("[Proxy] retrying payment (attempt " + (attempt + 1) + " )" + request.sender + " \n");
        }
        result=relPaymentGateway.processPayment(request);
        if(!result){break;}

    }

         if(!result){
             System.out.println("[Proxy] Payment failed after "+(retries)+" attempts for"+request.sender+".\n");
         }
    return result;


    }
    @Override
    public boolean validatePayment(PaymentRequest request) {
        return relPaymentGateway.validatePayment(request);
    }

    @Override
    public boolean initiatePayment(PaymentRequest request) {
        return relPaymentGateway.initiatePayment(request);
    }



    @Override
    public boolean confirmPayment(PaymentRequest request) {
        return relPaymentGateway.confirmPayment(request);
    }
}
