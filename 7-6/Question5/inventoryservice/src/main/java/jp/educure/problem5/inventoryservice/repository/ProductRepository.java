package jp.educure.problem5.inventoryservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public String findProductById(Long id) {
        return "Product " + id;
    }
}
