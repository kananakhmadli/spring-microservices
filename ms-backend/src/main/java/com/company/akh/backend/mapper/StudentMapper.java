package com.company.akh.backend.mapper;

import com.company.akh.backend.dto.StudentDto;
import com.company.akh.backend.dto.request.CreateStudentRequest;
import com.company.akh.backend.dto.request.UpdateStudentRequest;
import com.company.akh.backend.dto.response.CreateStudentResponse;
import com.company.akh.backend.entity.Student;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto toStudentDto(Student student);

    List<StudentDto> toStudentDtoList(List<Student> students);

    Student updateStudent(CreateStudentRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateStudent(UpdateStudentRequest request, @MappingTarget Student student);

    CreateStudentResponse toCreateStudentResponse(Student student);

}