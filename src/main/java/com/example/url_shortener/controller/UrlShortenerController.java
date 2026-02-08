package com.example.url_shortener.controller;

import com.example.url_shortener.service.UrlShortenerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class UrlShortenerController {

    public final UrlShortenerService urlShortenerService;

    public UrlShortenerController(UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
    }

    @GetMapping("/")
    public String home(){
        return "shortener";
    }

    @PostMapping("/shorten")
    public String shortenerUrl(@RequestParam String longUrl, Model model){
        //1. send longUrl to service layer to short it and save in db
        String shortUrl = urlShortenerService.getShortenerUrl(longUrl);
        model.addAttribute("shortUrl", shortUrl);
        return "shortener";
    }

}
