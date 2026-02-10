package com.Webapplication.webapplication.io;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryRequest {

    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private  String  bgColor;

    private String imgUrl;

}
