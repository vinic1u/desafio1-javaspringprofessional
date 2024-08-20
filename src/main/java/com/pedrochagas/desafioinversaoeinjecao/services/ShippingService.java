package com.pedrochagas.desafioinversaoeinjecao.services;

import com.pedrochagas.desafioinversaoeinjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        Double orderBaseValue = order.getBaseValue();
        if(orderBaseValue < 100.0) return 20.0;
        if(orderBaseValue < 200.0) return 12.0;
        return 0.0;
    }
}
