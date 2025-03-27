package com.example.service1;


import java.util.List;
import java.util.Optional;

public interface Service1Interface {

    void addService1(Service1Request service1Request);

    List<Service1> getAllService1Data();

    Optional<Service1> getService1ById(int id);
}
