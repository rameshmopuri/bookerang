package com.manideepla.bookerang;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @PostMapping("/user")
    void signupUser(@RequestBody User user) {
        System.out.println(user);
    }

}
