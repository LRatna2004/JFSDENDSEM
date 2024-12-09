package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome"; // Renders welcome.jsp
    }

    @RequestMapping("/test")
    public String test() {
        return "test"; // Renders test.jsp
    }

    @RequestMapping("/showInfo")
    public String showInfo() {
        return "showInfo"; // Renders showInfo.jsp
    }

    @RequestMapping("/addNumbers")
    public String addNumbers() {
        return "addNumbers"; // Renders addNumbers.jsp
    }

    @RequestMapping("/")
    public String home() {
        return "home"; // Renders home.jsp if you want a root URL
    }
}
