package com.example.demo.model.dto;

import com.example.demo.model.Lesson;
import com.example.demo.model.LessonAnswer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LessonQuestionDTO extends BaseDTO {

    private String questionTitle;

    private String question;

    private LessonAnswerDTO correctAnswer;
    private LessonDTO lesson;
    private List<LessonAnswerDTO> lessonAnswers;
    private int correctQuestionPosition;
    private LessonQuestionStatus lessonQuestionStatus;

    public enum LessonQuestionStatus {
        ERROR, SUCCESS, NOT_ANSWERED
    }
}

