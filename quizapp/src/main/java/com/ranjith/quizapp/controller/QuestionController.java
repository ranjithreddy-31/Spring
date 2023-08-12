package com.ranjith.quizapp.controller;


import com.ranjith.quizapp.model.Questions;
import com.ranjith.quizapp.model.Response;
import com.ranjith.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionService questionsService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions()
    {
        return questionsService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable String category)
    {
        return questionsService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Questions question)
    {
        return questionsService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Integer id)
    {
        return questionsService.deleteQuestion(id);
    }

}
