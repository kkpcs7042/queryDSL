package com.example.queryDsl.repo;

import com.example.queryDsl.model.Book;
import com.example.queryDsl.repo.Custom.BookRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {
}
