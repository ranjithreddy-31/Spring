package com.ranjith.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Questions {
    @Id
    int id;
    String question;
    String answer;
    String category;

}
