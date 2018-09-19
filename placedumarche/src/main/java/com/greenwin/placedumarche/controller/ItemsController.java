package com.greenwin.placedumarche.controller;

import com.greenwin.placedumarche.entities.Category;
import com.greenwin.placedumarche.entities.Item;
import com.greenwin.placedumarche.services.CategoryService;
import com.greenwin.placedumarche.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsController {

    @Autowired
    ItemService itemService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/items")
    public String items(Model model){
        List <Category> catList = categoryService.getCategories();
        model.addAttribute("listcat", catList);

        return "items";
    }

    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public void addItem(@RequestParam("name") String name, @RequestParam("price") float price, @RequestParam("desc") String description, @RequestParam("category") String cat){

        Category category = categoryService.getCategoryById(Integer.parseInt(cat));

        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setDescription(description);
        item.setCategory(category);


        itemService.addItem(item);
    }
}
