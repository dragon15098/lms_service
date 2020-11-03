package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.UserCourse;
import com.example.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface UserCourseRepository extends JpaRepository<UserCourse, Long>, JpaSpecificationExecutor<UserCourse> {

    @Query(value = " SELECT  uc.id as id, " +
            "uc.userId as userId, " +
            "uc.courseId as courseId, " +
            "uc.status as status, " +
            "uc.paymentStatus as paymentStatus, " +
            "uc.paymentDate as paymentDate, " +
            "uc.process as process, " +
            "uc.currentLessonId as currentLessonId, " +
            "uc.currentQuizId as currentQuizId " +
            " FROM UserCourse uc" +
            " WHERE uc.userId = :userId ")
    List<Tuple> getAllUserCourseByUserId(@Param("userId") Long userId);


    @Query(value = " SELECT  uc.id as id, " +
            "uc.userId as userId, " +
            "uc.courseId as courseId, " +
            "uc.status as status, " +
            "uc.paymentStatus as paymentStatus, " +
            "uc.paymentDate as paymentDate, " +
            "uc.process as process, " +
            "uc.currentLessonId as currentLessonId, " +
            "uc.currentQuizId as currentQuizId " +
            " FROM UserCourse uc" +
            " WHERE uc.id = :userCourseId")
    List<Tuple> getUserCourseById(@Param("userCourseId") Long userCourseId);
}