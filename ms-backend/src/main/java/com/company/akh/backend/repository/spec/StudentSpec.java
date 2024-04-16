package com.company.akh.backend.repository.spec;

import com.company.akh.backend.dto.StudentFilter;
import com.company.akh.backend.entity.Student;
import org.springframework.data.jpa.domain.Specification;

public class StudentSpec {

    public static final String ID = "id";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";

    private StudentSpec() {
    }

    public static Specification<Student> applyFilter(StudentFilter filter) {
        return Specification.where(equalPredicateSpec(FIRST_NAME, filter.getFirstName()))
                .and(equalPredicateSpec(LAST_NAME, filter.getLastName()));
    }

    private static Specification<Student> equalPredicateSpec(String field, Object value) {
        return (root, query, cb) -> value == null ? cb.conjunction() :
                cb.equal(root.get(field), value);
    }

}