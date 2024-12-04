package com.lazyengineer.api.question_paper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionPaperRequestDto {
    private String userId;
    private String title;
    private String about;
    private String semester;
    private String subject;
    private String unit;
    private String chapter;
    private String topic;
    private String tags;

    public QuestionPaperRequestDto(QuestionPaper questionPaper) {
        this.userId = questionPaper.getUserId();
        this.title = questionPaper.getTitle();
        this.about = questionPaper.getAbout();
        this.semester = questionPaper.getSemester();
        this.subject = questionPaper.getSubject();
        this.unit = questionPaper.getUnit();
        this.chapter = questionPaper.getChapter();
        this.topic = questionPaper.getTopic();
        this.tags = questionPaper.getTags();
    }

    public QuestionPaper questionPaperMapper(){
        QuestionPaper questionPaper = new QuestionPaper();
        questionPaper.setUserId(this.userId);
        questionPaper.setTitle(this.title);
        questionPaper.setAbout(this.about);
        questionPaper.setSemester(this.semester);
        questionPaper.setSubject(this.subject);
        questionPaper.setUnit(this.unit);
        questionPaper.setChapter(this.chapter);
        questionPaper.setTopic(this.topic);
        questionPaper.setTags(this.tags);
        return questionPaper;
    }

}