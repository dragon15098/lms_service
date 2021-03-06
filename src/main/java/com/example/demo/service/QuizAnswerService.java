package com.example.demo.service;

import com.example.demo.model.Quiz;
import com.example.demo.model.QuizAnswer;
import com.example.demo.model.dto.QuizAnswerDTO;

import java.util.List;

public interface QuizAnswerService {
    List<QuizAnswerDTO> getAllQuizAnswerByQuestionId(Long quizQuestionId);

    QuizAnswerDTO insertOrUpdate(QuizAnswerDTO quizAnswerDTO);

    List<QuizAnswerDTO> insertOrUpdate(List<QuizAnswerDTO> quizAnswerDTOs);

    void deleteAnswerByQuestionId(Long questionId);
}
