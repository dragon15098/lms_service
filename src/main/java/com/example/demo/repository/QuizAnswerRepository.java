package com.example.demo.repository;

import com.example.demo.model.QuizAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface QuizAnswerRepository extends JpaRepository<QuizAnswer, Long>, JpaSpecificationExecutor<QuizAnswer> {
    @Query(value = " SELECT qa.id as id, " +
            " qa.content as content " +
            " FROM QuizAnswer qa" +
            " WHERE qa.quizQuestionId = :questionId ")
    List<Tuple> getAllByQuestionId(@Param("questionId") Long questionId);

    @Transactional
    void deleteQuizAnswerByQuizQuestionId(Long quizQuestionId);

}
