package van.deventer.IoCPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import van.deventer.IoCPractice.service.testService;

@RestController
public class HomeController {
    @Autowired
    HomeController(testService testService){
        this.testService = testService;
    }

    testService testService;
    @Value("${msg}")
    String message;

    @RequestMapping("/")
    String home(){
        return message;
    }

    @RequestMapping("/ioc")
    String ioc(){
        return testService.serviceMessage();
    }
}
