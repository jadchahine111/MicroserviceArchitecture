package com.example.service1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service1") // Define a base path for the controller
public class Service1Controller {

    private final Service1Interface service1Interface;

    public Service1Controller(Service1Interface service1Interface1)  {
        this.service1Interface = service1Interface1;
    }

    // ResponseEntity to return JSON response
    @PostMapping
    public ResponseEntity<String> addService1(@RequestBody Service1Request service1) {
        service1Interface.addService1(service1);
        return ResponseEntity.ok("{\"message\": \"Service added successfully\"}");
    }

    @GetMapping
    public List<Service1> getAllService1Data() {
        return service1Interface.getAllService1Data();
    }

    @GetMapping("/{id}")
    public Optional<Service1> getService1ById(@PathVariable int id) {
        return service1Interface.getService1ById(id);
    }


    }
