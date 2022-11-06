package top.wisely.graphqldemo;

import org.springframework.beans.BeanUtils;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @MutationMapping
    public Author createAuthor(@Argument AuthorInput authorInput){
        Author author = new Author();
        BeanUtils.copyProperties(authorInput,author);
        return authorRepository.save(author);
    }
}
