package com.board.cyberboard.model;

import java.time.LocalDateTime;

public class LogEntry {
    private Long id;                // Identificador único do log
    private LocalDateTime timestamp; // Data e hora do log
    private String ip;              // IP de onde a ação foi executada
    private Boolean status;         // true = sucesso, false = falha
    private String location;        // Localização aproximada (cidade/país)

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
