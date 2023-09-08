package com.aulaCube.crud.controller;


import com.aulaCube.crud.model.Model;
import com.aulaCube.crud.service.ModelService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ModelController {

    @Autowired
    ModelService modelService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Model model){
        return ResponseEntity.ok(modelService.create(model));
    }
    @GetMapping
    public ResponseEntity<Object> get(){
        //uncomment kr dena
        return ResponseEntity.ok(modelService.get());

       // return ResponseEntity.ok("Working");
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable String id){
        return ResponseEntity.ok(modelService.getById(id));
    }
    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Model model){
         return ResponseEntity.ok(modelService.update(model));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id){
        return ResponseEntity.ok(modelService.delete(id));
    }



}
