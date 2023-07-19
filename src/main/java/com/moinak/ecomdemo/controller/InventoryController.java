package com.moinak.ecomdemo.controller;

import com.moinak.ecomdemo.entity.Inventory;
import com.moinak.ecomdemo.entity.InventoryWithProductDetails;
import com.moinak.ecomdemo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;


    @GetMapping("/inventory/")
    public List<Inventory> getCompleteInventory(){
        return inventoryService.getCompleteInventory();
    }

    @GetMapping("/inventory/{productId}")
    public Inventory getInventoryByProductId(@PathVariable("productId") String productIdString) {
        long productId;
        try {
            productId = Long.parseLong(productIdString);
        } catch (NumberFormatException e) {
            System.out.println("Exception while converting product id from string to long in getInventoryByProductId in inventory controller");
            return null;
        }
        return inventoryService.getInventoryByProductId(productId);
    }

    @GetMapping("/inventory/details")
    public List<InventoryWithProductDetails> getCompleteInventoryWithProductDetails() {
        return inventoryService.getCompleteInventoryWithProductDetails();
    }

    @GetMapping("/inventory/details/{productId}")
    public InventoryWithProductDetails getInventoryWithProductDetailsByProductId(@PathVariable("productId") String productIdString) {
        long productId;
        try {
            productId = Long.parseLong(productIdString);
        } catch (NumberFormatException e) {
            System.out.println("Exception while converting product id from string to long in getInventoryWithProductDetailsByProductId in inventory controller");
            return null;
        }
        return inventoryService.getInventoryWithProductDetailsByProductId(productId);
    }

}
