package com.eduit.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoResource {

    //cambios
    @GetMapping(path = "basicInfo", produces = "application/json")
    public AutoResponse getBasicInfo(){
        return new AutoResponse("emma","sedlaruk",2);
    }
}
