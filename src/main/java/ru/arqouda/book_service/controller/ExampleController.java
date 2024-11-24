package ru.arqouda.book_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.arqouda.book_service.service.ExampleService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/example")
public class ExampleController {
    private final ExampleService exampleService;
    @GetMapping("/create")
    public String CreateExample(){
        exampleService.saveExampleEntity();
        return "example entity created";
    }
    @GetMapping
    public String getBookName(){
        return exampleService.getBookName();
    }
}
