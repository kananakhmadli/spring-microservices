package com.company.akh.backend.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class StudentFilter {

    public static final Integer DEFAULT_PAGE = 0;
    public static final Integer DEFAULT_COUNT = 9;

    private Integer page;
    private Integer count;
    private String firstName;
    private String lastName;

    public Integer getPage() {
        return Objects.nonNull(page) ? page : DEFAULT_PAGE;
    }

    public Integer getCount() {
        return Objects.nonNull(count) ? count : DEFAULT_COUNT;
    }

}