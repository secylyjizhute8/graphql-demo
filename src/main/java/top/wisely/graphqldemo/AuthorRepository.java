package top.wisely.graphqldemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author findByIdCardNo(String idCardNo);
}
