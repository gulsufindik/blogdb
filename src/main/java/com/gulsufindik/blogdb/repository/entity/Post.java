package com.gulsufindik.blogdb.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder // bir sınıftan nesne türetmeyi sağlar
@Data //get set metodlarını otomatik tanımlar
@NoArgsConstructor // boş constructor
@AllArgsConstructor // dolu constructor oluştur
@ToString
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "published_at")
    private LocalDateTime publicationDate;

    private String author;

    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}