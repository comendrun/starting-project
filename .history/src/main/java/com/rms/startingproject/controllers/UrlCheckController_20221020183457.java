package com.rms.startingproject.controllers;

import java.io.IOException;
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

    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url) {

        String returnMessage = "";

        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCodeCategory = connection.getResponseCode();
            if (responseCodeCategory == 200) {
                returnMessage = SITE_IS_UP + " || up and running | this is the response: " + responseCodeCategory;

            } else {
                returnMessage = SITE_IS_DOWN + " || down and not running | this is the response: "
                        + responseCodeCategory;
            }
        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
        } catch (IOException e) {
            returnMessage = SITE;
        }
        return returnMessage;
    }

}
