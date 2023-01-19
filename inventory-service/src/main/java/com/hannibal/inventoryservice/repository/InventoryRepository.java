package com.hannibal.inventoryservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hannibal.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCode);

}
