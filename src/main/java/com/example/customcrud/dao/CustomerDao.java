package com.example.customcrud.dao;

import com.example.customcrud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
