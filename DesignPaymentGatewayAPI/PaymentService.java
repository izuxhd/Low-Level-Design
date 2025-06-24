package com.DesignPaymentGatewayAPI;

public class PaymentService {
    private final  static PaymentService instance=new PaymentService();
    private PaymentGateway gateway;
    private PaymentService(){}
    public  static PaymentService getinstance(){
        return  instance;

    }
    public void setGateway(PaymentGateway g){
       this.gateway= g;


    }
    boolean  processPayment(PaymentRequest request){
         if(gateway==null){
             System.out.println("[PaymentService] No Payment  gateway selected \n");
             return false;
         }
         return gateway.processPayment(request);

    }



}
