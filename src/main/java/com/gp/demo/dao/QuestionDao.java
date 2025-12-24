package com.gp.demo.dao;

import com.gp.demo.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

//    public void getAllQuestions() {
//    }
}
