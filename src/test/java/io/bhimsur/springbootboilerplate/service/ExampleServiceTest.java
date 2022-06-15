package io.bhimsur.springbootboilerplate.service;

import io.bhimsur.springbootboilerplate.dto.GetExampleRequest;
import io.bhimsur.springbootboilerplate.repository.ExampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ExampleServiceImpl.class)
@Slf4j
public class ExampleServiceTest {

    @Autowired
    private ExampleServiceImpl exampleService;

    @MockBean
    private ExampleRepository exampleRepository;

    @Test
    public void getExample() {
        var response = exampleService.getExample(GetExampleRequest.builder().build());
        assertNotNull(response);
    }
}