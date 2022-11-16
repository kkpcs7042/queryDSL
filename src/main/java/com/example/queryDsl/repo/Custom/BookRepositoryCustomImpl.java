package com.example.queryDsl.repo.Custom;

import com.example.queryDsl.model.Book;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.queryDsl.model.QBook.book;

@RequiredArgsConstructor
public class BookRepositoryCustomImpl implements BookRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Book> searchAll() {
        List<Book> result = queryFactory
                .selectFrom(book).fetch();
            return result;
    }
}
