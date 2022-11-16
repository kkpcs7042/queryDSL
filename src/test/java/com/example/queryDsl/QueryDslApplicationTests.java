package com.example.queryDsl;

import com.example.queryDsl.model.Book;
import com.example.queryDsl.model.Borrow;
import com.example.queryDsl.model.Member;
import com.example.queryDsl.repo.BookRepository;
import com.example.queryDsl.repo.BorrowRepository;
import com.example.queryDsl.repo.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@SpringBootTest
class QueryDslApplicationTests {

	@PersistenceContext
	private EntityManager em;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BorrowRepository borrowRepository;

	@BeforeEach
	void Before(){
		Book testBook = new Book();
		testBook.setBookId("book");
		testBook.setName("book");
		Book book = bookRepository.save(testBook);

		Member testMember = new Member();
		testMember.setMemberId("member");
		testMember.setName("member");
		Member member = memberRepository.save(testMember);

		Borrow testBorrow = new Borrow();
		testBorrow.setBooks(book);
		testBorrow.setMembers(member);
		borrowRepository.save(testBorrow);
	}
	@Test
	void JPQLTest() {
		String jpql = "select m from Book as m where m.name = 'book'";
		List<Book> resultList = em.createQuery(jpql, Book.class).getResultList();

		System.out.println(resultList.get(0).getBookId());
		System.out.println(resultList.get(0).getId().toString());
		System.out.println(resultList.get(0).getName());
	}
	@Test
	void queryDSLTest(){
		Book a = new Book();
		a.setBookId("test");
		a.setName("test");
		Book save = bookRepository.save(a);

		System.out.println(bookRepository.searchAll().get(0).getBookId());
		System.out.println(bookRepository.searchAll().get(0).getId().toString());
		System.out.println(bookRepository.searchAll().get(0).getName());
	}

}
