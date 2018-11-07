package com.alinso.styleapp.repository;

import com.alinso.styleapp.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends BaseRepository {
    CustomerRepository(){
        setTheClass(User.class);
    }
}
