package controllers;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    private final String SITE_IS_UP = "Site is Up";
    private final String SITE_IS_DOWN = "Site is Down";
    private final String INCORRECT_URL = "URL is incorrect";

    @GetMapping("/check/")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";

        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = urlObj.
        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
        }
        return returnMessage;
    }

}
