package jp.educure.problem5.inventoryservice.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
     public boolean checkAvailability(Long productId) {
        if (productId == null) {
            return false;
        }
        return productId % 2 == 0; 
    }
}
