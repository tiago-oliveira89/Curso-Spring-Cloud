package com.lab3.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lab3ClientController {

    //traz a configuração que veio via injeção de dependências do servidor de configuração
    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("lucky-word")
    public String showLucckyWord() {
        return "The lucky word is :"  +luckyWord;
    }
}
