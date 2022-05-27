package com.online.test.onlinetest.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.online.test.onlinetest.models.Question;

@Repository
    
public interface QuestionsRepository extends JpaRepository<Question,Long>{


}
