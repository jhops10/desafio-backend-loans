package com.jhops10.loans.controller.dto;

import com.jhops10.loans.domain.LoanType;

public record LoanResponse(LoanType type,
                           Double interestRate) {
}
