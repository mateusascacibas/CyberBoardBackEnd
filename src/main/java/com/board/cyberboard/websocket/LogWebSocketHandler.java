package com.board.cyberboard.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.concurrent.CopyOnWriteArrayList;

public class LogWebSocketHandler extends TextWebSocketHandler {

    private static final CopyOnWriteArrayList<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    	System.out.println("Nova conexão WebSocket estabelecida: " + session.getId());
        sessions.add(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    	System.out.println("Mensagem recebida: " + message.getPayload());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    	System.out.println("Conexão WebSocket fechada: " + session.getId());
        sessions.remove(session);
    }

    public static void sendLog(String log) {
        for (WebSocketSession session : sessions) {
            try {
                session.sendMessage(new TextMessage(log));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
