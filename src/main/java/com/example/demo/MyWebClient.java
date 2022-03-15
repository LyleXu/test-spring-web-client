package com.example.demo;
import lombok.RequiredArgsConstructor;

import com.example.demo.models.Details;
import com.example.demo.models.OwnerDetails;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class MyWebClient {

    private final WebClient.Builder webClientBuilder;

    public Mono<OwnerDetails> testSend(){
        return webClientBuilder.build().get()
            .uri("http://customers-service-00001-private/owners/1")
            .retrieve().bodyToMono(OwnerDetails.class);
    }

    public Mono<Details> testSend2(){
        return webClientBuilder.build().get()
            .uri("http://localhost:8080/test/hello2")
            .retrieve().bodyToMono(Details.class);
    }
}
