package com.pedrochagas.desafioinversaoeinjecao.services;

import com.pedrochagas.desafioinversaoeinjecao.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        Double orderBaseValue = order.getBaseValue();
        Double orderValueWithDiscount = orderBaseValue - orderBaseValue * (order.getDiscount() / 100);
        Double orderTotalValue = orderValueWithDiscount + shippingService.shipment(order);
        return orderTotalValue;
    }
    }
