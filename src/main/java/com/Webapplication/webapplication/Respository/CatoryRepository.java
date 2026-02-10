package com.Webapplication.webapplication.Respository;


import com.Webapplication.webapplication.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CatoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
