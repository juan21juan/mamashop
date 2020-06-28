package com.spring.react.gori.stylah.repository;

import com.spring.react.gori.stylah.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SalesRepository extends JpaRepository<Sale, Long> {
}
