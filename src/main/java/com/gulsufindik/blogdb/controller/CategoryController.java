package com.gulsufindik.blogdb.controller;

import com.gulsufindik.blogdb.repository.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @GetMapping
    public List<Category> getAllCategories() {
        // Tüm kategorileri veritabanından alır ve döndürür
    }

    @GetMapping("/{categoryId}")
    public Category getCategoryDetails(@PathVariable Long categoryId) {
        // categoryId parametresi ile belirli bir kategorinin detaylarını veritabanından alır ve döndürür
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        // category nesnesi ile yeni bir kategori oluşturur ve döndürür
    }

    @PutMapping("/{categoryId}")
    public Category updateCategory(@PathVariable Long categoryId, @RequestBody Category updatedCategory) {
        // categoryId parametresi ile belirli bir kategorinin bilgilerini günceller ve döndürür
    }

    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable Long categoryId) {
        // categoryId parametresi ile belirli bir kategoriyi siler
    }
}

