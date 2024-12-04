package com.lazyengineer.api.question_paper;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionPaperRepository extends JpaRepository<QuestionPaper, Integer> {

    Optional<QuestionPaper> findBy_id(Integer _id);

}
