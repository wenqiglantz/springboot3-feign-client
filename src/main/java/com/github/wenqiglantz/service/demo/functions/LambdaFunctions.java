package com.github.wenqiglantz.service.demo.functions;

import com.github.wenqiglantz.service.demo.data.DemoRequest;
import com.github.wenqiglantz.service.demo.data.DemoResponse;
import com.github.wenqiglantz.service.demo.democlient.DemoClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class LambdaFunctions {

    private final DemoClient demoClient;

    @Bean
    public Function<DemoRequest, DemoResponse> records() {
        return (request) -> {
            return demoClient.records(request);
        };
    }
}
