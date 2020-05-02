package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	@Query("from Book b where b.library.id = :libId")
	List<Book> findAllByLibraryId(@Param("libId") Integer libId);

}
