package com.Webapplication.webapplication.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Builder
@Entity
@Table(name="Category")
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String categoryId;

    @Column(unique = true)
    private String categoryName;
    private String categoryDescription;
    private  String  bgColor;

    private String imgUrl;

    private Timestamp createdDate;
    private Timestamp updatedDate;

}
