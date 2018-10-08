package com.alinso.cms.repository;

import com.alinso.cms.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends BaseRepository {
    CustomerRepository(){
        setTheClass(Customer.class);
    }
}
