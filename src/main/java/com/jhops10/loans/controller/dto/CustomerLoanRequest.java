package com.jhops10.loans.controller.dto;

import com.jhops10.loans.domain.Customer;

public record CustomerLoanRequest(Integer age,
                                  String cpf,
                                  String name,
                                  Double income,
                                  String location) {

    public Customer toCustomer() {
        return null;
    }
}
