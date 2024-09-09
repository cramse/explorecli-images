package com.example.explorecai.explorecliimages.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.explorecai.explorecliimages.model.IdName;
import com.example.explorecai.explorecliimages.model.Image;

@Repository
public interface ImageReopistory extends MongoRepository<Image, String>{
    Optional<Image> findByFileName(String name);

    List<IdName> findIdNameBy();

}
