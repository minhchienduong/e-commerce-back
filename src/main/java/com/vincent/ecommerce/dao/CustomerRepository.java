package com.vincent.ecommerce.dao;

import com.vincent.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);
}
