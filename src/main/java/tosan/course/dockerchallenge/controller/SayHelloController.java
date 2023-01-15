package tosan.course.dockerchallenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Stranger";
    }

    @GetMapping(value = "/hello" ,params = {"name"}  )
    public String sayHelloWithParam(@RequestParam String name) {
        var helloMsg = new StringBuilder();
        helloMsg.append("Hello ");
        helloMsg.append(name);
        return helloMsg.toString().replaceAll("(?=[A-Z]+)", " ").trim();
    }

    @GetMapping("/author")
    public String getAuthor() {
        return "Reza Armiun";
    }

}