package com.alinso.cms.controller;

import com.alinso.cms.entity.Customer;
import com.alinso.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.Set;

@RestController()
@RequestMapping("/customer")
public class CustomerController extends BaseController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public String create( @Valid @RequestBody Customer customer){

        customerRepository.saveOrUpdate(customer);
        return  customer.toString();
    }





}
