package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    @GetMapping("/check/")
public String getUrlStatusMessage(@RequestParam String url){

}
    
}
