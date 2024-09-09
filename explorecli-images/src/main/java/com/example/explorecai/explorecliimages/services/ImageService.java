package com.example.explorecai.explorecliimages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.explorecai.explorecliimages.model.IdName;
import com.example.explorecai.explorecliimages.model.Image;
import com.example.explorecai.explorecliimages.repo.ImageReopistory;

@Service
public class ImageService {
    private final ImageReopistory reopistory; 
    
    public ImageService(ImageReopistory reopistory){
        this.reopistory = reopistory;
    }

    public Image saveImage(Image image){
        return reopistory.save(image);
    }

    public Optional<Image> getImage(String id){
        return reopistory.findById(id);
    }
    public Optional<Image> findByName(String name){
        return reopistory.findByFileName(name);
    }
    
    public List<IdName> findIdNames(){
        return reopistory.findIdNameBy();
    }
    

}
