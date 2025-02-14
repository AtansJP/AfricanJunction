package com.africanjunction.groceryapi.services;

import com.africanjunction.groceryapi.models.Receipt;
import java.util.List;
import java.util.Optional;

public interface ReceiptService {
    Receipt saveReceipt(Receipt receipt);
    List<Receipt> getAllReceipts();
    Optional<Receipt> getReceiptById(Long id);
    void deleteReceipt(Long id);
}
