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

    private final String SITE_IS_UP = "Site is Up: Hello";
    private final String SITE_IS_DOWN = "Site is Down: Bye";
    private final String INCORRECT_URL = "URL is incorrect";

    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url) {
        // String responseCode = "";
        String returnMessage = "";

        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("stringGet");
            connection.connect();

            int responseCodeCategory = connection.getResponseCode() / 100;
            if (responseCodeCategory != 2 || responseCodeCategory != 3) {
                returnMessage = SITE_IS_DOWN;
            } else {
                returnMessage = SITE_IS_UP;
            }
        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
        } catch (IOException e) {
            returnMessage = SITE_IS_DOWN;
        }
        return returnMessage;
    }

}
