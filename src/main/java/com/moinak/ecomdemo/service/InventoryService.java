package com.moinak.ecomdemo.service;

import com.moinak.ecomdemo.entity.Inventory;
import com.moinak.ecomdemo.entity.InventoryWithProductDetails;
import com.moinak.ecomdemo.entity.Product;
import com.moinak.ecomdemo.repository.InventoryRepository;
import com.moinak.ecomdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    ProductRepository productRepository;

    public List<Inventory> getCompleteInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByProductId(long productId) {
        return inventoryRepository.findByProductId(productId);
    }

    public List<InventoryWithProductDetails> getCompleteInventoryWithProductDetails() {
        List<Inventory> inventoryList = getCompleteInventory();

        return inventoryList.stream()
                .map(inventory -> {
                    Product product = productRepository.findByProductId(inventory.getProductId());

                    return new InventoryWithProductDetails (
                            inventory.getProductId(),
                            inventory.getProductCount(),
                            product.getProductName(),
                            product.getProductMrp(),
                            product.getProductDiscount()
                    );
                }).toList();
    }

   public InventoryWithProductDetails getInventoryWithProductDetailsByProductId(long productId) {
        Inventory inventory = inventoryRepository.findByProductId(productId);
        Product product = productRepository.findByProductId(productId);
       return new InventoryWithProductDetails (
               inventory.getProductId(),
               inventory.getProductCount(),
               product.getProductName(),
               product.getProductMrp(),
               product.getProductDiscount()
       );
   }

}
