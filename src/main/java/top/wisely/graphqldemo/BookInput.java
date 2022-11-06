package top.wisely.graphqldemo;

import lombok.Data;

@Data
public class BookInput {
    private String isbn;
    private String title;
    private Integer pages;
    private String authorIdCardNo;
}
