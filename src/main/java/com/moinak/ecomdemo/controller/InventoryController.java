package com.moinak.ecomdemo.controller;

import com.moinak.ecomdemo.entity.Inventory;
import com.moinak.ecomdemo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/inventory/all")
    public List<Inventory> getCompleteInventory(){
        return inventoryService.getCompleteInventory();
    }

}
