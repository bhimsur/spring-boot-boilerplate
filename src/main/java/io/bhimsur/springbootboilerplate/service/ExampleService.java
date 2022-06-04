package io.bhimsur.springbootboilerplate.service;

import io.bhimsur.springbootboilerplate.dto.GetExampleRequest;
import io.bhimsur.springbootboilerplate.dto.GetExampleResponse;
import org.springframework.stereotype.Service;

@Service
public interface ExampleService {
    GetExampleResponse getExample(GetExampleRequest request);
}
