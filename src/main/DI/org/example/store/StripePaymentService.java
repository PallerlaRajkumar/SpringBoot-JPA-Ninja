package org.example.store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service("stripe")

public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;


    @Value("${stripe.timeout: 3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;






    @Override
    public void processPayment(double amount){

        System.out.println("Stripe");
        System.out.println("apiUrl:" + apiUrl);
        System.out.println("enabled:" + enabled);
        System.out.println("timeout:" + timeout);
        System.out.println("supportedCurrencies:" + supportedCurrencies);
        System.out.println("Processing payment of " + amount);
    }


}
