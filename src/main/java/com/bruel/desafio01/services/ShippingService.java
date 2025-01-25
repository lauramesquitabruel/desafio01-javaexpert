package com.bruel.desafio01.services;

import com.bruel.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        Double basic = order.getBasic();

        if(basic < 100){
            return 20.0;
        } else {
            if( basic < 200){
                return 12.0;
            } else {
                return 0.0;
            }
        }
    }
}
