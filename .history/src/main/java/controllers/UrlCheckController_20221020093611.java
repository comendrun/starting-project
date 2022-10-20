package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    @GetMapping("/check/")
public String getUrlStatusMessage(@ReqString url){

}
    
}
