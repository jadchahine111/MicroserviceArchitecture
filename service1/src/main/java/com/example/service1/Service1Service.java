package com.example.service1;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Service1Service implements Service1Interface {

    private final Service1Repository service1Repository;
    private Service1 service;

    // Constructor injection
    public Service1Service(Service1Repository service1Repository) {
        this.service1Repository = service1Repository;
    }

    @Override
    public List<Service1> getAllService1Data() {
        return service1Repository.findAll();
    }

    @Override
    public Optional<Service1> getService1ById(int id) {
        return service1Repository.findById(id);
    }

    @Override
    public void addService1 (Service1Request service) {
        Service1 service1 = Service1.builder()
                .field1(service.field1())
                .build();

        service1Repository.save(service1);
    }
}
