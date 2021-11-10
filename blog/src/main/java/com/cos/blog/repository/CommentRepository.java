package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.Reply;

public interface CommentRepository extends JpaRepository<Reply, Integer>{

}
