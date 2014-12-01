package com.maximino.sample.web.controllers;

import com.maximino.sample.model.Greeting;
import com.maximino.sample.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class GreetingController {

    @Inject
    private GreetingService greetingService;

    @RequestMapping(value = "/hello-world", method= RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") final String name) {
        Greeting greeting = greetingService.getGreeting(name);
        return greeting;
    }
}
