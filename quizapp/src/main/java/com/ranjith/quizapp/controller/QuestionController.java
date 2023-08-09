package com.ranjith.quizapp.controller;


import com.ranjith.quizapp.Questions;
import com.ranjith.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionService questionsService;
    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions()
    {
        return questionsService.getAllQuestions();
    }

}
