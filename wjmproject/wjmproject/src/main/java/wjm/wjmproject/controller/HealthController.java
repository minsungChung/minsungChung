package wjm.wjmproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthController {

    private final Environment env;

    @GetMapping("/profile")
    public String healthCheck() {
        return env.getProperty("local.server.port");
    }

}
