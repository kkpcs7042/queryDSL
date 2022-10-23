package com.example.queryDsl.repo.Custom;

import com.example.queryDsl.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepositoryCustom {
    List<Book> searchAll();
}
