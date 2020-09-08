package com.ev.springcloud.controller;

import com.ev.springcloud.service.impl.MessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private MessageProviderImpl messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }

}
