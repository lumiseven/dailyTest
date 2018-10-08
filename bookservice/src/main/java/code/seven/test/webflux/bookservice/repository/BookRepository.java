package code.seven.test.webflux.bookservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import code.seven.test.webflux.bookservice.model.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}