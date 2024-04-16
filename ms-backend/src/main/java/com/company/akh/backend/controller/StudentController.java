package com.company.akh.backend.controller;

import com.company.akh.backend.dto.StudentDto;
import com.company.akh.backend.dto.StudentFilter;
import com.company.akh.backend.dto.request.CreateStudentRequest;
import com.company.akh.backend.dto.request.UpdateStudentRequest;
import com.company.akh.backend.dto.response.CreateStudentResponse;
import com.company.akh.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostConstruct
    public void init() {
        var student1 = new CreateStudentRequest();
        student1.setFirstName("Huseyin");
        student1.setLastName("Huseyinli");
        student1.setAge(21);
        student1.setEmail("huseyin.huseyinli@gmail.com");
        student1.setPassword("12345");
        studentService.create(student1);

        var student2 = new CreateStudentRequest();
        student2.setFirstName("Kanan");
        student2.setLastName("Akhmadli");
        student2.setAge(20);
        student2.setEmail("kanan.akhmadli@gmail.com");
        student2.setPassword("12345");
        studentService.create(student2);
    }

    @PostMapping(value = "v1/students")
    public CreateStudentResponse create(@Valid @RequestBody CreateStudentRequest request) {
        return studentService.create(request);
    }

    @PutMapping(value = "v1/students")
    public void update(@RequestBody UpdateStudentRequest request) {
        studentService.update(request);
    }

    @DeleteMapping("v1/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) {
        studentService.deleteById(id);
    }

    @DeleteMapping("v1/students")
    public void deleteAll() {
        studentService.deleteAll();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value = "v1/students")
    public List<StudentDto> getAll() {
        return studentService.getAll();
    }

    @GetMapping(value = "v1/students/{id}")
    public StudentDto getById(@PathVariable String id) {
        return studentService.getById(id);
    }

    @GetMapping(value = "v1/students/search")
    public List<StudentDto> search(StudentFilter filter) {
        return studentService.search(filter);
    }

    //http://localhost:8089/api/v1/students/pagination/v1?page=0&size=2
    @GetMapping(value = "v1/students/pagination/v1")
    public List<StudentDto> pagination(
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        return studentService.pagination(page, size);
    }

    //http://localhost:8089/api/v1/students/pagination/v2?page=0&size=2
    @GetMapping(value = "v1/students/pagination/v2")
    public List<StudentDto> pagination(Pageable pageable) {
        return studentService.pagination(pageable);
    }

}