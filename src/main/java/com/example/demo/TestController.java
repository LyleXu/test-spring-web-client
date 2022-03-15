package com.example.demo;
import lombok.RequiredArgsConstructor;

import com.example.demo.models.Details;
import com.example.demo.models.OwnerDetails;
import com.google.gson.Gson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("test")
@RequiredArgsConstructor
@RestController
public class TestController {

    private final MyWebClient webClient;
    private Gson gson = new Gson();

    @RequestMapping("hello")
    public String testHello(){
        return "Hello VS Code";
    }

    @RequestMapping(value = "hello2", produces = "application/json")
    public String testHello2(){
        Details details = new Details();
        details.setName("abc");
        return gson.toJson(details);
    }

    @RequestMapping("send")
    public Mono<OwnerDetails> testSend(){
        return webClient.testSend();
    }

    @RequestMapping("send2")
    public Mono<Details> testSend2(){
        return webClient.testSend2();
    }
}
