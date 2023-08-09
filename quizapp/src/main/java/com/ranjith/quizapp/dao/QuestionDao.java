package com.ranjith.quizapp.dao;

import com.ranjith.quizapp.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {

}
