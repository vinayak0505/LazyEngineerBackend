package com.lazyengineer.api.question_paper;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionPaperService {

    private final QuestionPaperRepository questionPaperRepository;

    public QuestionPaperService(QuestionPaperRepository usersRepository) {
        this.questionPaperRepository = usersRepository;
    }

    public List<QuestionPaper> getQuestionPapers() {
        return questionPaperRepository.findAll();
    }

    public QuestionPaper getQuestionPaper(Integer _id) {
        return questionPaperRepository.findBy_id(_id).orElse(null);
    }

    public QuestionPaper saveQuestionPaper(QuestionPaperRequestDto questionPaperRequestDto) {
        return questionPaperRepository.save(questionPaperRequestDto.questionPaperMapper());
    }

}
