package controllers;

import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    private final String SITE_IS_UP = "Site is Up";
    private final String SITE_IS_DOWN = "Site is Down";

    @GetMapping("/check/")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";

        URL urlObj = new URL
        return returnMessage;
    }

}