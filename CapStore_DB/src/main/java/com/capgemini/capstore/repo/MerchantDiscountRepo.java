package com.capgemini.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Discount;

@Repository
public interface MerchantDiscountRepo extends JpaRepository<Discount,Integer>{
}
