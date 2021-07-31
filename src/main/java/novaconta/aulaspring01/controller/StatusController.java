package novaconta.aulaspring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//notação para informar que é uma aplicação REST
@RestController
public class StatusController {
    //Método para saber se a aplicação está online
    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }
}
