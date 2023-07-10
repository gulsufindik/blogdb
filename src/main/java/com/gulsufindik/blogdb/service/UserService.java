package com.gulsufindik.blogdb.service;

import com.gulsufindik.blogdb.repository.IUserRepository;
import com.gulsufindik.blogdb.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final IUserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }


}
