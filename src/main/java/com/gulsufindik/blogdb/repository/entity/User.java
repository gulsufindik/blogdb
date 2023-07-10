package com.gulsufindik.blogdb.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder // bir sınıftan nesne türetmeyi sağlar
@Data //get set metodlarını otomatik tanımlar
@NoArgsConstructor // boş constructor
@AllArgsConstructor // dolu constructor oluştur
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Post> posts;

    /*
     Bir kullanıcının birden çok yazısı olacağı için
     User sınıfı ile Post sınıfı arasında bir "one-to-many" ilişkisi bulunacaktır.

     mappedBy parametresi bu ilişkinin Post sınıfındaki author alanı tarafından yönetildiğini belirtir.
     cascade parametresi ise kullanıcının silindiğinde ilişkili yazıların da silinmesini sağlar.

     Kullanıcının birden çok yazısını tutmak için posts adında bir liste alanı ekledim.
     */



}
