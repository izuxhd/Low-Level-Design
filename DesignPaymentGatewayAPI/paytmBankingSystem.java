package com.DesignPaymentGatewayAPI;
import java.lang.Math;
public class paytmBankingSystem implements BankingSystem{
    public paytmBankingSystem(){}
    @Override
    public boolean processPayment(Double amount) {
        //simulate   20 %
        System.out.println("[Paytm System] processing payment  of "+amount +">>>>");
        Integer r = (int)(Math.random() * 20);

        return r<20;
    }
}
