package com.alinso.styleapp.repository;

import com.alinso.styleapp.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository extends BaseRepository {
    CommentRepository(){
        this.setTheClass(Comment.class);
    }
}
