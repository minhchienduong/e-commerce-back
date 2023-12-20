package com.vincent.ecommerce.dto;

import com.vincent.ecommerce.entity.Address;
import com.vincent.ecommerce.entity.Customer;
import com.vincent.ecommerce.entity.Order;
import com.vincent.ecommerce.entity.OrderItem;
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
