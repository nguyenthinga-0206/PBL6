package com.example.demo.restcontroller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RestChatBot {
    private final String PATH_URL_AI = "http://localhost:5000/";

    @RequestMapping(value = "/chatbot",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String Send(@RequestParam String msg) {
        String uri = PATH_URL_AI + "send/" + msg;
        System.out.println(uri);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
        return result;
    }
}
