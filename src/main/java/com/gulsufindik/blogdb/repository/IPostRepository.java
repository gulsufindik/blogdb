package com.gulsufindik.blogdb.repository;

import com.gulsufindik.blogdb.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post, Long> {

    Post findByAuthor(String author);

}
