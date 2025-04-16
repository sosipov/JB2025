package com.colvir.lesson3.service;


import org.springframework.stereotype.Component;
import jakarta.inject.Provider;

@Component
public class ServiceA {

    public ServiceA(Provider<ServiceB> serviceBProvider) {
        this.serviceBProvider = serviceBProvider;
    }

    private final Provider<ServiceB> serviceBProvider;

    public ServiceB getServiceB() {
        return serviceBProvider.get();
    }
}
