package com.exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.exam.demo.model.Item;
import com.exam.demo.repository.ItemRepository;

@Service
public class ItemService {

@Autowired
ItemRepository repo;

public Item save(Item item){
return repo.save(item);
}

public List<Item> getAll(){
return repo.findAll();
}

}