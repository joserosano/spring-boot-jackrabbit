package com.jose.springbootjackrabbit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/document")
public class DocumentController {

    @GetMapping
    public String getDocument(@RequestParam(value="id") String id) {
        return id;
    }
}
