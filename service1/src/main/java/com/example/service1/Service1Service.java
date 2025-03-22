package com.example.service1;

import org.springframework.web.client.RestTemplate;

public class Service1Service implements Service1Interface {

    private final Service1Repository service1Repository;

    // Constructor injection
    public Service1Service(Service1Repository service1Repository) {
        this.service1Repository = service1Repository;
    }


}
