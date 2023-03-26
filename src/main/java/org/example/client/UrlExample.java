package org.example.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("file:C:\\devel\\learn\\http-servlets\\untitled\\src\\main\\java\\org\\example\\DatagramRunner.java");
        URLConnection urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        URL url = new URL("https://www.google.com");
        URLConnection urlConnection = url.openConnection();

        try (OutputStream outputStream = urlConnection.getOutputStream()) {
        }

        System.out.println();
    }
}
