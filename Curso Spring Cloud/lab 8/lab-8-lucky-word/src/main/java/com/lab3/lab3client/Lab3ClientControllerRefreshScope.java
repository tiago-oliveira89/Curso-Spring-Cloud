package com.lab3.lab3client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*alternativa para o configuration properties*/
@RestController
@RefreshScope
public class Lab3ClientControllerRefreshScope {

    //tem que repetir o prefixo aqui
    @Value("${wordConfig.luckyWord}") String luckyWord;
    @Value("${wordConfig.preamble}") String preamble;

    @GetMapping("/lucky-word-2")
    public String showLuckyWord() {
        return preamble + ": " + luckyWord;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

}