package com.gulsufindik.blogdb.controller;

import com.gulsufindik.blogdb.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        // Tüm kullanıcıları veritabanından al ve döndür
    }

    @GetMapping("/{userId}")
    public User getUserDetails(@PathVariable Long userId) {
        // userId parametresi ile belirli bir kullanıcının detaylarını veritabanından alır ve döndürür
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        // user nesnesi ile yeni bir kullanıcı oluştur ve döndür
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User updatedUser) {
        // userId parametresi ile belirli bir kullanıcının bilgilerini günceller ve döndürür
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        // userId parametresi ile belirli bir kullanıcıyı siler
    }
}