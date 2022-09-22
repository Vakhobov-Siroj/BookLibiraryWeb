package uz.jl.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
