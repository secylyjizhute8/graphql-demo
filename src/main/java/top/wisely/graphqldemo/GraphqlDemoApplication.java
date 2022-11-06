package top.wisely.graphqldemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(BookRepository bookRepository, AuthorRepository authorRepository){
//		return args -> {
//			Book book1 = new Book(null,"9787121282089","JavaEE开发的颠覆者：Spring Boot实战", 524, "341234567891234567");
//			Book book2 = new Book(null,"9787121377921","从企业级开发到云原生微服务:Spring Boot实战", 504, "341234567891234567");
//			Book book3 = new Book(null,"9787121347962","架构整洁之道", 524, "341234567891234568");
//			bookRepository.save(book1);
//			bookRepository.save(book2);
//			bookRepository.save(book3);
//			Author author1 = new Author(null,"341234567891234567","汪云飞",38);
//			Author author2 = new Author(null,"341234567891234568","罗伯特C.马丁",70);
//			authorRepository.save(author1);
//			authorRepository.save(author2);
//
//		};
//	}

}
