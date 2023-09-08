package com.aulaCube.crud.service;


import com.aulaCube.crud.model.Model;
import com.aulaCube.crud.repo.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    ModelRepo modelRepo;

    public String create(Model model){
        try {
            modelRepo.save(model);
            return "Saved Successfully";
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public List<Model> get(){
        return modelRepo.findAll();
    }
    public Model getById(String id){
        return modelRepo.findById(id).isPresent()?modelRepo.findById(id).get():null;
    }

    public String update(Model model) {
        try {
            return !ObjectUtils.isEmpty(modelRepo.findById(model.getId())) ? getModelObject(model) : "Id does not exists";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    public String getModelObject(Model model){
        modelRepo.save(modelRepo.findById(model.getId()).get().setDescription(model.getDescription()).setTitle(model.getTitle()).setStatus(model.getStatus()));
        return "Updated Successfully";
    }


    public String delete(String id){
        String outString="Deleted successfully!!";
         if(!ObjectUtils.isEmpty(modelRepo.findById(id))) modelRepo.deleteById(id);
         else outString="Id does not exists" ;
       return outString;
    }





}
