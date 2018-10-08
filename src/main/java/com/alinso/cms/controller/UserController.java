package com.alinso.cms.controller;

import com.alinso.cms.entity.User;
import com.alinso.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/customer")
public class UserController extends BaseController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public String create( @Valid @RequestBody User customer){

        customerRepository.saveOrUpdate(customer);
        return  customer.toString();
    }





}
