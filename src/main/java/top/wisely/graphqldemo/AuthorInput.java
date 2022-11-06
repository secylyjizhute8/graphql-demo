package top.wisely.graphqldemo;

import lombok.Data;

@Data
public class AuthorInput {
    private String idCardNo;
    private String name;
    private Integer age;
}
