package com.online.test.onlinetest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
    
public interface OptionRepository extends JpaRepository<Id,Long>{

    
}

