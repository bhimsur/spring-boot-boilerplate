package io.bhimsur.springbootboilerplate.controller;

import io.bhimsur.springbootboilerplate.dto.GetExampleRequest;
import io.bhimsur.springbootboilerplate.dto.GetExampleResponse;
import io.bhimsur.springbootboilerplate.service.ExampleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
@Slf4j
public class ExampleController {
    private final ExampleService service;

    public ExampleController(@Qualifier("firstService") ExampleService service) {
        this.service = service;
    }

    @PostMapping("/getexample")
    public GetExampleResponse getExample(@RequestBody GetExampleRequest request) {
        return service.getExample(request);
    }
}
