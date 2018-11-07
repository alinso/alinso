package com.alinso.styleapp.repository;

import com.alinso.styleapp.entity.Vote;
import org.springframework.stereotype.Repository;

@Repository
public class VoteRepository extends BaseRepository {
    VoteRepository(){
        this.setTheClass(Vote.class);
    }
}
