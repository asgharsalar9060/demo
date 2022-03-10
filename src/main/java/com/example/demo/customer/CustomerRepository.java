package com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
