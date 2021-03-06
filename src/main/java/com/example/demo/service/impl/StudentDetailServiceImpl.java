package com.example.demo.service.impl;

import com.example.demo.model.StudentDetail;
import com.example.demo.model.dto.StudentDetailDTO;
import com.example.demo.model.helper.StudentDetailHelper;
import com.example.demo.repository.StudentDetailRepository;
import com.example.demo.service.StudentDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentDetailServiceImpl implements StudentDetailService {

    private final StudentDetailRepository studentDetailRepository;

    @Override
    public StudentDetailDTO getDetailById(Long studentId) {
        Optional<StudentDetailDTO> studentDetail = studentDetailRepository.getDetailById(studentId).stream().map(tuple -> {
            StudentDetailDTO studentDetailDTO = new StudentDetailDTO();
            studentDetailDTO.setId((Long) tuple.get("id"));
            studentDetailDTO.setGrade((String) tuple.get("grade"));
            studentDetailDTO.setSchool((String) tuple.get("school"));
            return studentDetailDTO;

        }).findFirst();

        return studentDetail.orElse(new StudentDetailDTO());
    }

    @Override
    public StudentDetailDTO insertOrUpdate(StudentDetailDTO studentDetailDTO) {
        StudentDetailHelper studentDetailHelper = new StudentDetailHelper(studentDetailDTO);
        StudentDetail studentDetail = studentDetailHelper.studentDetailDTOToStudentDetail();
        studentDetail= studentDetailRepository.save(studentDetail);
        studentDetailDTO.setId(studentDetail.getId());
        return studentDetailDTO;
    }
}
