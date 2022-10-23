package com.example.queryDsl;

import com.example.queryDsl.model.Book;
import com.example.queryDsl.model.Member;
import com.example.queryDsl.repo.BookRepository;
import com.querydsl.core.QueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

import static com.example.queryDsl.model.QMember.member;

@Transactional
@SpringBootTest
class QueryDslApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void test(){
		QueryFactory em;
		Book a = new Book();
		a.setBookId("test");
		a.setName("test");
		Book save = bookRepository.save(a);

		System.out.println(bookRepository.searchAll().get(0).getBookId());
		System.out.println(bookRepository.searchAll().get(0).getId().toString());
		System.out.println(bookRepository.searchAll().get(0).getName());
	}
}
