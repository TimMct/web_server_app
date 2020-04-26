package com.example.architecture.businessLogic;

import com.example.architecture.accesData.entity.Picture;
import com.example.architecture.accesData.repo.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PictureService {

    @Autowired
    private PictureRepository pictureRepository;

    public Iterable<Picture> findAllPictures(){
        return pictureRepository.findAll();
    }

    public Picture getPicByName(String picName){
        return pictureRepository.getPictureByName(picName);
    }

    public void deleteAll(){
        pictureRepository.deleteAll();
    }

    public Picture getPicByUserName(String userName){
        return pictureRepository.getPictureByOwnerName(userName);
    }

}