package com.lab4.sentence.lab4sentence.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//posso passar um path aqui tbm
@FeignClient("SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
    String  getWord();
}
