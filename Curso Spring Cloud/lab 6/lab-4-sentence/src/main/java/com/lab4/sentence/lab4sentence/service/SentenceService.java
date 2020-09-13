package com.lab4.sentence.lab4sentence.service;

import com.lab4.sentence.lab4sentence.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceService {

    @Autowired
    AdjectiveClient adjectiveService;

    @Autowired
    ArticleClient articleService;

    @Autowired
    NounClient nounService;

    @Autowired
    SubjectClient subjectService;

    @Autowired
    VerbClient verbService;

    public String getSentence() {
        return subjectService.getWord() + " "+
                verbService.getWord() + " " +
                articleService.getWord()+ " " +
                adjectiveService.getWord() + " " +
                nounService.getWord();

    }
}
