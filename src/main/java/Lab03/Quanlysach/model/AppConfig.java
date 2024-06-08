package Lab03.Quanlysach.model;
import Lab03.Quanlysach.model.Book;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Book> getBooks()
    {
        List<Book> listBooks = new ArrayList<>();

        //tạo sách bằng cách sử dụng Setter - NoArgsContructor Loobok
        Book book1 = new Book();
        book1.setId(12);
        book1.setTitle("Clean Code");
        book1.setAuthor("Robert C.Martin");
        book1.setPrice(47.0);
        book1.setCategory("Software Engineering");
        listBooks.add(book1);

        // Tạo sách bằng cách sử dụng ALLArgsConstructor Lambok
        Book book2 = new Book ( 2,  "Design Patterns: Elements of Reusable Object-Oriented Software",
            "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",  55.0,  "Software Design");
        listBooks.add(book2);
        // Tạo sách bằng cách sử dụng Builder Lombok
        Book book3 = Book.builder()
            .id(3)
            .title("Effective Java")
            .author("Joshua Bloch")
            .price(45.0)
            .category("Programming")
            .build();
        listBooks.add(book3);
        return listBooks;
    }
}
