package com.lab4.sentence.lab4sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WordService {

    private String urlZull = "http://192.168.0.7:8080/service";

    @Autowired
    private RestTemplate restTemplate;

    public String getAdjective() {
        return restTemplate.getForObject(urlZull+"/adjective", String.class);
    }

    public String getArticle() {
       return restTemplate.getForObject(urlZull+"/article", String.class);
    }

    public String getNoun() {
        return restTemplate.getForObject(urlZull+"/noun", String.class);
    }

    public String getSubject() {
        return restTemplate.getForObject(urlZull+"/subject", String.class);
    }

    public String getVerb() {
        return restTemplate.getForObject(urlZull+"/verb", String.class);
    }



}
