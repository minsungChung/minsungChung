package wjm.wjmproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PingController {

    @PostMapping("/intro")
    public String postMethod(@RequestBody String id){
        return id + "님 환영합니다!";
    }
}
