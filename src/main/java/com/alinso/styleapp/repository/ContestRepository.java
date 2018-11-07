package com.alinso.styleapp.repository;

import com.alinso.styleapp.entity.Contest;
import org.springframework.stereotype.Repository;

@Repository
public class ContestRepository extends BaseRepository {
    ContestRepository(){
        this.setTheClass(Contest.class);
    }
}
