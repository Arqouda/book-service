package ru.arqouda.book_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.arqouda.book_service.Book;
import ru.arqouda.book_service.repository.BookRepository;
import ru.arqouda.book_service.service.ExampleService;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {
    public final BookRepository bookRepository;

    @Override
    public void saveExampleEntity() {
        Book book = Book.builder()
                .bookName("example book name")
                .authorName("example author name")
                .build();
        bookRepository.save(book);
    }

    @Override
    public String getBookName() {
        return bookRepository.findAll().get(0).getBookName();
    }
}
