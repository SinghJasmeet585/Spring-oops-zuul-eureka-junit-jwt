package com.niit.dao;

import com.niit.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //such as @Component -> used in dao layer -> DataAccessException
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
