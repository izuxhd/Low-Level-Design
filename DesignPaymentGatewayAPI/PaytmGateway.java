package com.DesignPaymentGatewayAPI;

public class PaytmGateway extends PaymentGateway {
   public PaytmGateway(){
       this.bankingSystem=new paytmBankingSystem();

   }
    @Override
    public boolean initiatePayment(PaymentRequest request) {
       System.out.println("[Paytm] Intiating payment of "+request.sender+"  .\n"+" currency :"+request.currency+" for "+request.amount+"\n");
        return bankingSystem.processPayment(request.amount);
    }

    @Override
    public boolean validatePayment(PaymentRequest request) {
        if(request.amount<=0 || request.currency!="INR"){
          return false;
        }
        return true;
    }

    @Override
    public boolean confirmPayment(PaymentRequest request) {
       System.out.println("[Paytm] COnfriming payment  of :"+request.sender+"\n");
        return true;
    }
}
