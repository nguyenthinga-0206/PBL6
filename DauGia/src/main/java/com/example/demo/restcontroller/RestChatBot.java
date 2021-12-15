package com.example.demo.restcontroller;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RestChatBot {
    private final String PATH_URL_AI = "http://localhost:5000/";
//    private final String PATH_URL_AI = "http://01ca-113-185-115-151.ngrok.io/";

    @RequestMapping(value = "/chatbot",
            method = RequestMethod.POST)
    @ResponseBody
    public String Send(@RequestParam String msg) {
        String uri = PATH_URL_AI + "send/" + msg;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
