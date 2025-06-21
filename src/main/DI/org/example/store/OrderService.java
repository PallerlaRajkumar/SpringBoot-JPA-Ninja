package org.example.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private  PaymentService paymentService;

    public OrderService(PaymentService paymentService, int X){}

    @Autowired
    public OrderService(//@Qualifier("stripe")
                         PaymentService paymentService){

        this.paymentService = paymentService;
        System.out.println("OrderService Created: ");
    }


//    @PostConstruct
//    public void init(){
//        System.out.println("OrderService PostConstruct  : ");
//    }
//
//@PreDestroy
//    public void cleanup(){
//        System.out.println("OrderService PreDestroy  : ");
//    }






    public void placeOrder(){


        paymentService.processPayment(100.00);

    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
