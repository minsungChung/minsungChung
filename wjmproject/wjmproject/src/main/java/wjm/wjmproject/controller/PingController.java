package wjm.wjmproject.controller;

import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wjm.wjmproject.domain.Restaurant;
import wjm.wjmproject.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PingController {

    @Autowired
    private TestService testService;
    @PostMapping("/intro")
    public List<Restaurant> postMethod(@RequestBody String req) throws ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(req);
        JSONObject body = (JSONObject) obj;

        String area = (String) body.get("area");
        List<Restaurant> result = testService.findByAllArea(area);
        System.out.println(result);

        return result;
    }
}
