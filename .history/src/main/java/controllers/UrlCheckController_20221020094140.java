package controllers;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    private final String SITE_IS_UP = "Site is Up";
    private final String SITE_IS_DOWN = "Site is Down";
    private final String INCORRECT_URL = "Site is Down";

    @GetMapping("/check/")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";

        try {
            URL urlObj = new URL(url);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnMessage;
    }

}
