package wjm.wjmproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping/{id}")
    public String Ping(@PathVariable String id){
        return id;
    }
}
