package com.ecs.ingestion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingest")
public class ClaimIngestionController {

    @PostMapping
    public String ingestClaim(@RequestBody String payload) {
        return "Claim received: " + payload;
    }
}
