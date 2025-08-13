package com.example.ecommerce.controller;

import com.example.ecommerce.model.Deal;
import com.example.ecommerce.response.ApiResponse;
import com.example.ecommerce.service.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/deals")
public class DealController {

    private final DealService dealService;

    @PostMapping
    public ResponseEntity<Deal> createDeal(@RequestBody Deal deal) {
        Deal createdDeal = dealService.createDeal(deal);
        return new ResponseEntity<>(createdDeal, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Deal> updateDeal(@PathVariable Long id, @RequestBody Deal deal) throws Exception {
        Deal updatedDeal = dealService.updateDeal(deal, id);
        return new ResponseEntity<>(updatedDeal, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteDeal(@PathVariable Long id) throws Exception {
        dealService.deleteDeal(id);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Deal deleted");
       return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }

}



