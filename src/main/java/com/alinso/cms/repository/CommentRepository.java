package com.alinso.cms.repository;

import com.alinso.cms.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository extends BaseRepository {
    CommentRepository(){
        this.setTheClass(Comment.class);
    }
}
