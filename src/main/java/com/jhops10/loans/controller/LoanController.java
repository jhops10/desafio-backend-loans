package com.jhops10.loans.controller;

import com.jhops10.loans.controller.dto.CustomerLoanRequest;
import com.jhops10.loans.controller.dto.CustomerLoanResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest) {
       return null;
    }
}
