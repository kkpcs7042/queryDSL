package com.example.queryDsl.repo.Custom;

import com.example.queryDsl.model.Book;
import com.example.queryDsl.model.Borrow;

import java.util.List;

public interface BorrowRepositoryCustom {
    List<Borrow> searchBorrowByBookId();
}
