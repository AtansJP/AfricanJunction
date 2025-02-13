package com.AfricanJunction.groceryapi.ious;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class IOUService {
    private final IOURepository iouRepository;

    public IOUService(IOURepository iouRepository) {
        this.iouRepository = iouRepository;
    }

    // Get all IOUs
    public List<IOU> getAllIOUs() {
        return (List<IOU>) iouRepository.findAll();
    }

    // Get a specific IOU by ID
    public IOU getIOU(UUID id) {
        return iouRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("IOU not found with ID: " + id));
    }

    // Create a new IOU
    public IOU createIOU(IOU iou) {
        if (iou.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        return iouRepository.save(iou);
    }

    // Update an existing IOU
    public IOU updateIOU(UUID id, IOU updatedIOU) {
        IOU existingIOU = getIOU(id);
        existingIOU.setBorrower(updatedIOU.getBorrower());
        existingIOU.setLender(updatedIOU.getLender());
        existingIOU.setAmount(updatedIOU.getAmount());
        existingIOU.setDateTime(updatedIOU.getDateTime());
        return iouRepository.save(existingIOU);
    }

    // Delete an IOU by ID
    public void deleteIOU(UUID id) {
        if (!iouRepository.existsById(id)) {
            throw new NoSuchElementException("IOU not found with ID: " + id);
        }
        iouRepository.deleteById(id);
    }
}

