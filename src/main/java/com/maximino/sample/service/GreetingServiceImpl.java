package com.maximino.sample.service;

import com.maximino.sample.model.Greeting;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class GreetingServiceImpl implements GreetingService {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting getGreeting(final String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
        return greeting;
    }
}
