package com.ecs.processing.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/process")
public class ClaimProcessingController {

    @PostMapping
    public String processClaim(@RequestBody String payload) {
        // Temporary placeholder logic
        return "Claim processed: " + payload;
    }
}
