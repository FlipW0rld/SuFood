package com.laioffer.onlineorder;


import com.laioffer.onlineorder.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DevRunner implements ApplicationRunner {


    private static final Logger logger = LoggerFactory.getLogger(DevRunner.class);


    private final CustomerService customerService;


    public DevRunner(
            CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        customerService.signUp("foo@mail.com", "123456", "Foo", "Bar");
    }
}
