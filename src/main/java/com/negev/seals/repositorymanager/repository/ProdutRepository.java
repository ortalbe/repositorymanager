package com.negev.seals.repositorymanager.repository;

import com.negev.seals.repositorymanager.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProdutRepository extends JpaRepository<Product, Long> {

    Product findByProductName(String productName);


}

