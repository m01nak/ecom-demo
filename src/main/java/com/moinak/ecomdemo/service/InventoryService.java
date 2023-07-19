package com.moinak.ecomdemo.service;

import com.moinak.ecomdemo.entity.Inventory;
import com.moinak.ecomdemo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public List<Inventory> getCompleteInventory() {
        return inventoryRepository.findAll();
    }
}
