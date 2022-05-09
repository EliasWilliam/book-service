package br.com.william.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.william.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
	

