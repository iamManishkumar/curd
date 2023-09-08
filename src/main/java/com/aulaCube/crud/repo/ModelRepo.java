package com.aulaCube.crud.repo;


import com.aulaCube.crud.model.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ModelRepo extends MongoRepository<Model,String> {
}
