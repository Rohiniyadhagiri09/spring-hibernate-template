package com.exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.exam.demo.model.Item;
import com.exam.demo.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

@Autowired
ItemService service;

@PostMapping("/add")
public Item addItem(@RequestBody Item item){
return service.save(item);
}

@GetMapping("/all")
public List<Item> getItems(){
return service.getAll();
}

}