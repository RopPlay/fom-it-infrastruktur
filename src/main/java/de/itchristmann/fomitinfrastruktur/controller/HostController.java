package de.itchristmann.fomitinfrastruktur.controller;

import de.itchristmann.fomitinfrastruktur.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class HostController {

    @Autowired
    HostService service;

    @GetMapping("/info")
    public String getHostData() throws UnknownHostException {
        return service.getHostData();
    }
}
