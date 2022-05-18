package com.online.test.onlinetest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.test.onlinetest.models.Exam;

@Repository
    
public interface ExamRepository extends JpaRepository<Exam,Long>{


} 

