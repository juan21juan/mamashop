package com.spring.react.gori.stylah.repository;

import com.spring.react.gori.stylah.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findByGenderOrderByBirthdayAsc(String gender);
    List<Users> findByGenderAndAddress(String gender, String address);

    @Query("select u from Users u where u.dateRegistered like :dateRegistered%")
    List<Users> findByDateRegistered(long dateRegistered);
}
