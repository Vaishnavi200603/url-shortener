package com.example.url_shortener.service;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class UrlShortenerService {

    public String getShortenerUrl(String longUrl) {
        return "http://localhost:8080/abc123";
    }
}
