package com.company.akh.backend.repository;

import com.company.akh.backend.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends
        JpaRepository<Student, String>, JpaSpecificationExecutor<Student> {

    @Query("SELECT u from Student u where u.email=:em")
    Optional<Student> findByEmail(@Param("em") String email);

    Page<Student> findAll(Specification<Student> spec, Pageable pageable);

    @Query("SELECT CASE WHEN count (u.email)> 0 THEN false ELSE true END FROM Student u WHERE u.email=:e")
    boolean checkByEmail(@Param("e") String email);

}