package com.alinso.styleapp.repository;

import com.alinso.styleapp.entity.Photo;
import org.springframework.stereotype.Repository;

@Repository
public class PhotoRepository extends BaseRepository {
    PhotoRepository(){
        this.setTheClass(Photo.class);
    }
}
