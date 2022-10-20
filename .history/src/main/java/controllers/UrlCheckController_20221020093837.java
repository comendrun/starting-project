package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {


    private final String SITE_IS_UP= "Site is Up";
    private final String SITE_IS_DOWN = 

    @GetMapping("/check/")
public String getUrlStatusMessage(@RequestParam String url){

}
    
}
