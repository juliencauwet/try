package com.greenwin.placedumarche.services;

import com.greenwin.placedumarche.entities.Item;
import com.greenwin.placedumarche.entities.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void addItem(Item item){
        itemRepository.save(item);
    }


}
