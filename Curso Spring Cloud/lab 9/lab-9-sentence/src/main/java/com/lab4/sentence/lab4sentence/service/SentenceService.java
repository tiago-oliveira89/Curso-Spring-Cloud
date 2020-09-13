package com.lab4.sentence.lab4sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceService {



    @Autowired
    private WordService wordService;

    public String getSentence() {
        return wordService.getSubject() + " "+
                wordService.getVerb() + " " +
                wordService.getArticle() + " " +
                wordService.getAdjective() + " " +
                wordService.getNoun() ;
    }
}
