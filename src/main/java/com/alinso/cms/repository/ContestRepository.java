package com.alinso.cms.repository;

import com.alinso.cms.entity.Contest;
import org.springframework.stereotype.Repository;

@Repository
public class ContestRepository extends BaseRepository {
    ContestRepository(){
        this.setTheClass(Contest.class);
    }
}
