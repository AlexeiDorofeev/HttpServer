package org.example.server;

public class HttpServerRunner {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer(8000, 100);
        httpServer.run();
    }
}
