package it.develhope.First.API1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    public String name = "Francesco";

    StringBuilder str = new StringBuilder(name);
    StringBuilder reverseStr = str.reverse();

    @GetMapping
    public String getName(){
        return name;
    }

    @PostMapping
    public String getReversedName(){
        return reverseStr.toString();
    }

}
