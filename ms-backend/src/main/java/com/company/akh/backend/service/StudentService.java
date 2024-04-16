package com.company.akh.backend.service;

import com.company.akh.backend.dto.StudentDto;
import com.company.akh.backend.dto.StudentFilter;
import com.company.akh.backend.dto.request.CreateStudentRequest;
import com.company.akh.backend.dto.request.UpdateStudentRequest;
import com.company.akh.backend.dto.response.CreateStudentResponse;
import com.company.akh.backend.entity.Student;
import com.company.akh.backend.error.exceptions.StudentNotFoundException;
import com.company.akh.backend.mapper.StudentMapper;
import com.company.akh.backend.repository.StudentRepository;
import com.company.akh.backend.repository.spec.StudentSpec;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.company.akh.backend.repository.spec.StudentSpec.ID;

@Slf4j
@Service
@Transactional
@SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "unused"})
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public CreateStudentResponse create(CreateStudentRequest request) {
        request.setPassword(passwordEncoder.encode(request.getPassword()));
        var student = studentRepository.save(studentMapper.updateStudent(request));
        return studentMapper.toCreateStudentResponse(student);
    }

    public void update(UpdateStudentRequest request) {
        var student = studentRepository.findById(request.getId())
                .orElseThrow(() -> errStudentNotFound("id", request.getId()));
        studentMapper.updateStudent(request, student);
        studentRepository.save(student);
    }

    public void deleteById(String id) {
        var student = studentRepository.findById(id).orElseThrow(() -> errStudentNotFound("id", id));
        studentRepository.deleteById(id);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<StudentDto> getAll() {
        log.info("getStudents methods is called");
        return studentMapper.toStudentDtoList(studentRepository.findAll());
    }

    public StudentDto getById(String id) {
        var student = studentRepository.findById(id)
                .orElseThrow(() -> errStudentNotFound("id", id));
        return studentMapper.toStudentDto(student);
    }

    public StudentDto findByEmail(String email) {
        Student student = studentRepository.findByEmail(email)
                .orElseThrow(() -> errStudentNotFound("email", email));
        return studentMapper.toStudentDto(student);
    }

    public List<StudentDto> pagination(Integer page, Integer size) {
        var pageable = PageRequest.of(page, size);
        var students = studentRepository.findAll(pageable).getContent();
        return studentMapper.toStudentDtoList(students);
    }

    public List<StudentDto> pagination(Pageable pageable) {
        var students = studentRepository.findAll(pageable).getContent();
        var all = studentRepository.findAll(pageable);
        log.error("Page size is = " + all.getSize());
        return studentMapper.toStudentDtoList(students);
    }

    public List<StudentDto> search(StudentFilter filter) {
        Specification<Student> spec = StudentSpec.applyFilter(filter);
        Pageable pageable =
                PageRequest.of(filter.getPage(), filter.getCount(), Sort.by(ID).descending());
        Page<Student> pageContent = studentRepository.findAll(spec, pageable);
        return studentMapper.toStudentDtoList(pageContent.getContent());
    }

    private StudentNotFoundException errStudentNotFound(String param, String value) {
        return new StudentNotFoundException("Student not found," + param + ": " + value);
    }

}