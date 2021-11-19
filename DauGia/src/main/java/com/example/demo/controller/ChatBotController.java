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

@Controller
public class ChatBotController {
    @RequestMapping(value = "/chatbot", method = RequestMethod.GET)
    public String chatGui() {
        return "chat/chatbot";
    }

    @RequestMapping(value = "/chatbot",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String Send(@RequestParam String msg) {
        String uri = "http://localhost:5000/send/" + msg;
        System.out.println(uri);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public ResponseEntity<String> SendAPI(@RequestParam String msg) {
        String uri = "http://localhost:5000/send/" + msg;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
