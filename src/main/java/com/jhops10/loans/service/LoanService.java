package com.jhops10.loans.service;

import com.jhops10.loans.controller.dto.CustomerLoanRequest;
import com.jhops10.loans.controller.dto.CustomerLoanResponse;
import com.jhops10.loans.controller.dto.LoanResponse;
import com.jhops10.loans.domain.Loan;
import com.jhops10.loans.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest loanRequest) {

        var customer = loanRequest.toCustomer();
        var loan = new Loan((customer));

        List<LoanResponse> loans = new ArrayList<>();

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isConsignmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignmentLoanInterestRate()));
        }

        if (loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }


        return new CustomerLoanResponse(loanRequest.name(), loans);
    }
}
