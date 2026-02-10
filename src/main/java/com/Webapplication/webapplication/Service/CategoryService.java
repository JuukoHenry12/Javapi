package com.Webapplication.webapplication.Service;

import com.Webapplication.webapplication.io.CategoryRequest;
import com.Webapplication.webapplication.io.CategoryResponse;

public interface CategoryService {
    CategoryResponse addCategory(CategoryRequest request);
}
