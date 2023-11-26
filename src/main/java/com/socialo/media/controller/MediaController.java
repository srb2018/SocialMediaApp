package com.socialo.media.controller;

import com.socialo.media.businessService.MediaBusinessService;
import com.socialo.media.dto.UserDto;
import com.socialo.media.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MediaController {

    @Autowired
    private MediaBusinessService mediaBusinessService;

    @PostMapping("/signUp")
    public String registerUser(@RequestBody UserDto userDto) {
        return mediaBusinessService.registerUser(userDto);
    }

    @PostMapping("/getUser")
    public User findUserDetails(@RequestParam String userName) {
        return mediaBusinessService.getUserDetails(userName);
    }

    @PostMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return mediaBusinessService.findAllusers();
    }

    @ResponseBody
    @RequestMapping("/soundCheck")
    public String sendResponse(){
        return "Hello!!!";
    }

    @ResponseBody
    @RequestMapping("/")
    public String sendResponseEmpty(){
        return "Hello from Empty Box!!!";
    }


}
