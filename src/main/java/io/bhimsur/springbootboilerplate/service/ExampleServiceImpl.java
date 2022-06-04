package io.bhimsur.springbootboilerplate.service;

import io.bhimsur.springbootboilerplate.dto.GetExampleRequest;
import io.bhimsur.springbootboilerplate.dto.GetExampleResponse;
import io.bhimsur.springbootboilerplate.repository.ExampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Qualifier("firstService")
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    private ExampleRepository repository;

    @Override
    public GetExampleResponse getExample(GetExampleRequest request) {
        return null;
    }

}
