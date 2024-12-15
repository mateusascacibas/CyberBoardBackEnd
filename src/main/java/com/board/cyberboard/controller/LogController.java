package com.board.cyberboard.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.cyberboard.model.LogEntry;

@RestController
@RequestMapping("/logs")
public class LogController {

    @GetMapping
    public List<LogEntry> getLogs() {
        // Simulando alguns logs estáticos
        LogEntry log1 = new LogEntry();
        log1.setId(1L);
        log1.setTimestamp(LocalDateTime.now());
        log1.setIp("192.168.0.1");
        log1.setStatus(true);
        log1.setLocation("São Paulo, BR");

        LogEntry log2 = new LogEntry();
        log2.setId(2L);
        log2.setTimestamp(LocalDateTime.now().minusMinutes(10));
        log2.setIp("10.0.0.2");
        log2.setStatus(false);
        log2.setLocation("Rio de Janeiro, BR");

        // Retornando uma lista de logs
        return Arrays.asList(log1, log2);
    }
}
