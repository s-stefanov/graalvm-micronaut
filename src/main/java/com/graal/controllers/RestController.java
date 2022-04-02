package com.graal.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class RestController {

    @Get("/rest")
    public HttpResponse<?> getSomeData() {
        return HttpResponse.ok("Some string");
    }
}
