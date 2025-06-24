package com.DesignPaymentGatewayAPI;

public class PaymentRequest {
    public   String  sender;
    public String receiver;
    public String  currency;
    public double  amount;
    public PaymentRequest( final String sender,final String receiver,final  String   currency,final Double amount){
        this.amount=amount;
        this.sender=sender;
        this.receiver=receiver;
        this.currency=currency;

    }
}
