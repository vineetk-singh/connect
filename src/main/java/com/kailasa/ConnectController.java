package com.kailasa;

import io.micronaut.http.annotation.*;

@Controller("/connect")
public class ConnectController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}