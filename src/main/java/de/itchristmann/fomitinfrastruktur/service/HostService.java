package de.itchristmann.fomitinfrastruktur.service;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class HostService {
    public String getHostData() throws UnknownHostException {
        return """
                Local
                Host-Adresse %s
                Host-Name %s
                                
                Remote
                Host-Adresse %s
                Host-Name %s
                """.formatted(
                InetAddress.getLocalHost().getHostAddress(),
                InetAddress.getLocalHost().getHostName(),
                InetAddress.getLoopbackAddress().getHostAddress(),
                InetAddress.getLoopbackAddress().getHostName()
        );
    }
}
