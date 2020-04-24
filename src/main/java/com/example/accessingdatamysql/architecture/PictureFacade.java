package com.example.accessingdatamysql.architecture;

public class PictureFacade {

    PictureRepo  pictureRepo;

    public PictureFacade(PictureRepo pictureRepo){
        this.pictureRepo = pictureRepo;
    }

    public Picture findById(Integer id){
        return pictureRepo.findById(id);
    }

}