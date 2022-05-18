package com.online.test.onlinetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.test.onlinetest.models.Exam;


@Repository //muy importante    
public interface ExamRepository extends JpaRepository<Exam,Long>{


} 

