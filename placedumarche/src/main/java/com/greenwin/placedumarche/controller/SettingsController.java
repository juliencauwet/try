package com.greenwin.placedumarche.controller;

import com.greenwin.placedumarche.entities.Category;
import com.greenwin.placedumarche.entities.CategoryRepository;
import com.greenwin.placedumarche.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SettingsController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/settings")
    public String settings(){
        return "settings";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/settings")
    public void addCategory(@RequestParam ("category") String cat){
        Category category = new Category();
        category.setName(cat);
        categoryService.addCategory(category);
    }
}
