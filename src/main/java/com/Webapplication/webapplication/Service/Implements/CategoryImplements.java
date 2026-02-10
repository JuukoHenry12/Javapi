package com.Webapplication.webapplication.Service.Implements;

import com.Webapplication.webapplication.Entity.CategoryEntity;
import com.Webapplication.webapplication.Respository.CatoryRepository;
import com.Webapplication.webapplication.Service.CategoryService;
import com.Webapplication.webapplication.io.CategoryRequest;
import com.Webapplication.webapplication.io.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryImplements implements CategoryService {

    private final CatoryRepository categoryRepository;

    @Override
    public CategoryResponse addCategory(CategoryRequest request){
        CategoryEntity newcategory = convertToEntity(request);
        newcategory =categoryRepository.save(newcategory);
        return convertToResponse(newcategory);

    }

    private CategoryResponse  convertToResponse(CategoryEntity newcategory){
        return CategoryResponse.builder()
                .categoryId(newcategory.getCategoryId())
                .categoryName(newcategory.getCategoryName())
                .categoryDescription(newcategory.getCategoryDescription())
                .bgColor(newcategory.getBgColor())
                .imgUrl(newcategory.getImgUrl())
                .createdDate(newcategory.getCreatedDate())
                .updatedDate(newcategory.getUpdatedDate())
                .build();
    }

    private CategoryEntity convertToEntity(CategoryRequest request){
         return CategoryEntity.builder()
                 .categoryId(UUID.randomUUID().toString())
                 .categoryName(request.getCategoryName())
                 .bgColor(request.getBgColor())
                 .build();
    }

}
