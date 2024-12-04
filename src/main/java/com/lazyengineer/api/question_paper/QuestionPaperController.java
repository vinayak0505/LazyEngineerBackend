package com.lazyengineer.api.question_paper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.lazyengineer.api.util.CustomResponseEntity;

import java.net.URI;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/question_paper")
public class QuestionPaperController {

    private final QuestionPaperService questionPaperService;

    public QuestionPaperController(QuestionPaperService questionPaperService) {
        this.questionPaperService = questionPaperService;
    }

    @GetMapping("")
    public ResponseEntity<CustomResponseEntity<List<QuestionPaper>>> getQuestionPapers() {
        List<QuestionPaper> questionPapers = questionPaperService.getQuestionPapers();
        return ResponseEntity.ok(new CustomResponseEntity<List<QuestionPaper>>(questionPapers, "Success", "200"));
    }

    @PostMapping("")
    public ResponseEntity createQuestionPaper(
            @RequestPart MultipartFile file,
            @RequestPart(required = false) MultipartFile image,
            @ModelAttribute QuestionPaperRequestDto questionPaperRequestDto) {
        System.err.println(questionPaperRequestDto);
        System.err.println(file);
        // System.err.println(file);
        // QuestionPaper questionPaper =
        // questionPaperService.saveQuestionPaper(questionPaperRequestDto);
        // return new ResponseEntity<QuestionPaper>(questionPaper, HttpStatus.CREATED);
        return ResponseEntity.created(URI.create("/question_paper")).build();
    }

}
