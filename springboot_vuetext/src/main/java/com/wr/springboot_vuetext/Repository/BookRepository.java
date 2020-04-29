package com.wr.springboot_vuetext.Repository;

import com.wr.springboot_vuetext.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{
}
