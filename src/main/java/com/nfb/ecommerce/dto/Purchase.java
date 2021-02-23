package com.nfb.ecommerce.dto;

import com.nfb.ecommerce.entity.Address;
import com.nfb.ecommerce.entity.Customer;
import com.nfb.ecommerce.entity.Order;
import com.nfb.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
