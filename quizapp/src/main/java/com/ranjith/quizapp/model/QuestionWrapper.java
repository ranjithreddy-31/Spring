package com.ranjith.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
    private Integer id;
    private String question;

    public QuestionWrapper(Integer id, String question) {
        this.id = id;
        this.question = question;
    }
}
