package consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class BaseController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/get")
    public String echo() {
        return restTemplate.getForObject("http://config/config/get",String.class);
    }


}
