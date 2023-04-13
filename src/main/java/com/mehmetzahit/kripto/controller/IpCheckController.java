package com.mehmetzahit.kripto.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ip-check")
public class IpCheckController {

    @GetMapping
    public String getTicker() {
        return new RestTemplate().getForObject("http://checkip.dyndns.org", String.class);
    }

}
