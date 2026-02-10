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
    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private  String bgColor;
    private String imgUrl;

    private Timestamp createdDate;
    private Timestamp updatedDate;

}
