package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ChatBotController {
    private final String PATH_URL_AI = "http://localhost:5000/";

    @RequestMapping(value = "/chatbot", method = RequestMethod.GET)
    public String chatGui() {
        return "chat/chatbot";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public ResponseEntity<String> SendAPI(@RequestParam String msg) {
        String uri = PATH_URL_AI + "send/" + msg;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
