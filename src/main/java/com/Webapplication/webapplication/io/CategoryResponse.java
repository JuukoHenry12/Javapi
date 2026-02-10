package com.Webapplication.webapplication.io;


import lombok.Builder;
import lombok.Data;
import java.sql.Timestamp;

@Builder
@Data
public class CategoryResponse {
    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private  String  bgColor;
    private String imgUrl;

    private Timestamp createdDate;
    private Timestamp updatedDate;
}
