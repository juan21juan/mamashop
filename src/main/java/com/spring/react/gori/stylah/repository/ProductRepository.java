package com.spring.react.gori.stylah.repository;

import com.spring.react.gori.stylah.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
}
