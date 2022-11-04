package wjm.wjmproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PingController {

    @RequestMapping(value = "/test/{user}", method = RequestMethod.POST)
    public String Ping(@PathVariable String user){
        return user;
    }
}
