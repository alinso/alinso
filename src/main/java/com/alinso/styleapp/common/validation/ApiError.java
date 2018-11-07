package com.alinso.styleapp.common.validation;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiError {
    //HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors

    private HttpStatus status;
    private String message;
    private List<String> errors;

     ApiError(HttpStatus status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }


    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
