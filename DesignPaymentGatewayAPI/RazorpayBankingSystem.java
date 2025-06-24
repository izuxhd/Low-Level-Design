package com.DesignPaymentGatewayAPI;

public class RazorpayBankingSystem implements  BankingSystem{
    public  RazorpayBankingSystem(){

    }
    @Override
    public boolean processPayment(Double amount) {
        System.out.println("[Bankinf System razorpay] processing payment  of "+amount +">>>>");
        Integer  r= (int) (Math.random()%100);
        return r<90;

    }
}
