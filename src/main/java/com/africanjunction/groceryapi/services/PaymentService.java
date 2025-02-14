package com.africanjunction.groceryapi.services;

import com.africanjunction.groceryapi.models.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment savePayment(Payment payment);
    List<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Long id);
    void deletePayment(Long id);
}
