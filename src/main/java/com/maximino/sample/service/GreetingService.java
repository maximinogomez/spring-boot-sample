package com.maximino.sample.service;

import com.maximino.sample.model.Greeting;

public interface GreetingService {
    Greeting getGreeting(final String name);
}
