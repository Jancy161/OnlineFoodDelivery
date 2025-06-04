package com.examly.service;

import com.examly.entity.Payment;

public interface PaymentService {
    boolean processPayment(Payment payment);
}
