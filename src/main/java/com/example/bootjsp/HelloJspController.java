package com.example.bootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Application Scan할 때...
public class HelloJspController {

    @GetMapping("/hello-jsp")
    public String helloJsp() {
        // /WEB-INF/views + {} + .jsp
        return "hello";
    }
}
