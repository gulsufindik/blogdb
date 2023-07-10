package com.gulsufindik.blogdb.controller;

import com.gulsufindik.blogdb.repository.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @GetMapping
    public List<Post> getAllPosts() {
        // Tüm yazıları veritabanından alır ve döndürür
    }

    @GetMapping("/{postId}")
    public Post getPostDetails(@PathVariable Long postId) {
        // postId parametresi ile belirli bir yazının detaylarını veritabanından alır ve döndürür
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        // post nesnesi ile yeni bir yazı oluşturur ve döndürür
    }

    @PutMapping("/{postId}")
    public Post updatePost(@PathVariable Long postId, @RequestBody Post updatedPost) {
        // postId parametresi ile belirli bir yazının bilgilerini günceller ve döndürür
    }

    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable Long postId) {
        // postId parametresi ile belirli bir yazıyı siler
    }

    @GetMapping("/user/{userId}")
    public List<Post> getPostsByUser(@PathVariable Long userId) {
        // userId parametresi ile belirli bir kullanıcıya ait yazıları veritabanından alır ve döndürür
    }

    @GetMapping
    public List<Post> searchPostsByKeyword(@RequestParam("search") String keyword) {
        // keyword parametresi ile yazıları arar ve döndürür
    }

    @GetMapping
    public List<Post> getPostsByCategory(@RequestParam("category") String category) {
        // category parametresi ile belirli bir kategoriye ait yazıları getirir ve döndürür
    }
}
    /*
    @RequestParam anotasyonu, HTTP isteği parametrelerini almak için kullanılır.
    search ve category parametreleriyle arama ve kategorilendirme yapmak için kullanıyoruz.
     */


