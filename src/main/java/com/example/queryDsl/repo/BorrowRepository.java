package com.example.queryDsl.repo;

import com.example.queryDsl.model.Borrow;
import com.example.queryDsl.repo.Custom.BorrowRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long>, BorrowRepositoryCustom {
}
