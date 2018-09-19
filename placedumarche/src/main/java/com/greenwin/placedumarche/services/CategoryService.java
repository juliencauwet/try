package com.greenwin.placedumarche.services;

import com.greenwin.placedumarche.entities.Category;
import com.greenwin.placedumarche.entities.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public List<Category> getCategories(){
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    public Category getCategoryById(Integer id){
        Category category = categoryRepository.findCategoryById(id);

        return category;
    }
}
