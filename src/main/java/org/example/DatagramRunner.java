package org.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramRunner {
    public static void main(String[] args) throws IOException {
        InetAddress localhost = InetAddress.getByName("localhost");
        try (DatagramSocket datagramSocket = new DatagramSocket()) {
            byte[] bytes = "Hello from UDP client".getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, localhost, 7777);
            datagramSocket.send(packet);
        }
    }
}
