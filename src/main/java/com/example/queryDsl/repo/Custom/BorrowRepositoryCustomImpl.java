package com.example.queryDsl.repo.Custom;

import com.example.queryDsl.model.Book;
import com.example.queryDsl.model.Borrow;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.queryDsl.model.QBook.book;
import static com.example.queryDsl.model.QBorrow.borrow;

@RequiredArgsConstructor
public class BorrowRepositoryCustomImpl implements BorrowRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Borrow> searchBorrowByBookId() {
//        BooleanExpression where = ;
//        return queryFactory.select(borrow).from(borrow,book).where();
        return null;
    }
}
