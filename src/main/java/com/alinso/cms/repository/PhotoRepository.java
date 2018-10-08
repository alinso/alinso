package com.alinso.cms.repository;

import com.alinso.cms.entity.Photo;
import org.springframework.stereotype.Repository;

@Repository
public class PhotoRepository extends BaseRepository {
    PhotoRepository(){
        this.setTheClass(Photo.class);
    }
}
