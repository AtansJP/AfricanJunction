package com.AfricanJunction.groceryapi.ious;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ious")
public class IOUController {
    private final IOUService iouService;

    public IOUController(IOUService iouService) {
        this.iouService = iouService;
    }

    // GET all IOUs
    @GetMapping
    public ResponseEntity<List<IOU>> getAllIOUs() {
        return ResponseEntity.ok(iouService.getAllIOUs());
    }

    // GET a single IOU by ID
    @GetMapping("/{id}")
    public ResponseEntity<IOU> getIOU(@PathVariable UUID id) {
        return ResponseEntity.ok(iouService.getIOU(id));
    }

    // POST: Create a new IOU
    @PostMapping
    public ResponseEntity<IOU> createIOU(@RequestBody IOU iou) {
        return ResponseEntity.ok(iouService.createIOU(iou));
    }

    // PUT: Update an existing IOU
    @PutMapping("/{id}")
    public ResponseEntity<IOU> updateIOU(@PathVariable UUID id, @RequestBody IOU updatedIOU) {
        return ResponseEntity.ok(iouService.updateIOU(id, updatedIOU));
    }

    // DELETE: Remove an IOU by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIOU(@PathVariable UUID id) {
        iouService.deleteIOU(id);
        return ResponseEntity.noContent().build();
    }
}

