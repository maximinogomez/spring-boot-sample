package com.maximino.sample.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AppHealth implements HealthIndicator {

    @Override
    public Health health() {
        // perform some specific health checks
        // such as database connections, api services, etc...
        return Health.up().build();
    }
}
