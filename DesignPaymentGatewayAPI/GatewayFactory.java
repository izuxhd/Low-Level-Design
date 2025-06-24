package com.DesignPaymentGatewayAPI;

public class GatewayFactory {
private  static final GatewayFactory instance=new GatewayFactory();
private GatewayFactory(){}
    public  static  GatewayFactory getInstance(){
     return instance;
 }
 public PaymentGatewayProxy getGateways(GatewayType type){
    if(type==GatewayType.PAYTM){
        PaymentGateway gateway=new PaytmGateway() ;
         return new PaymentGatewayProxy(3,gateway);



    }

    else{
        PaymentGateway gateway=new RazorPayGateway() ;
        return new PaymentGatewayProxy(1,gateway);

    }

    }
}
