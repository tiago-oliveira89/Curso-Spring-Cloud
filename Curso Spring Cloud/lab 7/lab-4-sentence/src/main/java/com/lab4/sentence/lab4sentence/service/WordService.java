package com.lab4.sentence.lab4sentence.service;

import com.lab4.sentence.lab4sentence.client.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

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

    //método que vai ser chamado em caso de falha
    @HystrixCommand(fallbackMethod="getFallbackAdjective")
    public String getAdjective() {
        return adjectiveService.getWord();
    }

    public String getArticle() {
        return articleService.getWord();
    }

    @HystrixCommand(fallbackMethod="getFallBackNoun")
    public String getNoun() {
        return nounService.getWord();
    }

    @HystrixCommand(fallbackMethod="getFallbackSubject")
    public String getSubject() {
        return subjectService.getWord();
    }

    public String getVerb() {
        return verbService.getWord();
    }

    public String getFallbackAdjective() {
        return  "";
    }

    public String getFallbackSubject() {
        return  "Alguem";
    }

    public String getFallBackNoun() {
        return  "Algo";
    }


}
