package van.deventer.IoCPractice.service;

import org.springframework.stereotype.Service;

@Service
public class testService {
    public String serviceMessage(){
        return "hello from the service";
    }
}
