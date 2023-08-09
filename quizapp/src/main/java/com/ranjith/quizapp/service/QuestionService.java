package com.ranjith.quizapp.service;

import com.ranjith.quizapp.Questions;
import com.ranjith.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Questions>getAllQuestions()
    {
        return questionDao.findAll();
    }
}
