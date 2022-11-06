package top.wisely.graphqldemo;

import org.springframework.beans.BeanUtils;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book bookByIsbn(@Argument String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    @SchemaMapping(typeName = "Book" ,field = "author")
    public Author getAuthor(Book book){
        return authorRepository.findByIdCardNo(book.getAuthorIdCardNo());
    }

    @MutationMapping
    public Book createBook(@Argument BookInput bookInput){
        Book book = new Book();
        BeanUtils.copyProperties(bookInput,book);
        return bookRepository.save(book);
    }


}
