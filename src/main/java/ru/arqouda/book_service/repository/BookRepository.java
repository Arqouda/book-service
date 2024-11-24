package ru.arqouda.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arqouda.book_service.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
