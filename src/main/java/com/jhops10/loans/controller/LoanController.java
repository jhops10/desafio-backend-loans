package com.jhops10.loans.controller;

import com.jhops10.loans.controller.dto.CustomerLoanRequest;
import com.jhops10.loans.controller.dto.CustomerLoanResponse;
import com.jhops10.loans.service.LoanService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody @Valid CustomerLoanRequest loanRequest) {

        var loanResponse = loanService.checkLoanAvailability(loanRequest);

       return ResponseEntity.ok(loanResponse);
    }
}
