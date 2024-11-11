package com.project.learning.langa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class entity {
    @GetMapping("/amittad")
    public String amit(){
       return "amit tad is coming";
    }


}
