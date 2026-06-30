package com.company.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}