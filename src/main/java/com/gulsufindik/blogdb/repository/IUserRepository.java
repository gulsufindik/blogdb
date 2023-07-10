package com.gulsufindik.blogdb.repository;

import com.gulsufindik.blogdb.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findById(Long id);
    List<User> findAllBy(String username);

}
