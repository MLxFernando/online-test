package com.online.test.onlinetest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.online.test.onlinetest.models.Option;

@Repository
    
public interface OptionRepository extends JpaRepository<Option,Long>{

    
}

