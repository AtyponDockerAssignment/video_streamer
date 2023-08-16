package me.hashealayan.video_streamer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PotatoController {
    @PostMapping(value = "/login")
    public String login() {
        return "redirect:blobs";
    }

    @GetMapping(value = "/blobs")
    public String blobs() {
        return "blobs";
    }
}
