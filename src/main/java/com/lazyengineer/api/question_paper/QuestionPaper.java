package com.lazyengineer.api.question_paper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;
    private String userId;
    private String title;
    private String about;
    private String semester;
    private String subject;
    private String unit;
    private String chapter;
    private String topic;
    private String tags;
    private String mediaLink;
    private String imageLink;
}
