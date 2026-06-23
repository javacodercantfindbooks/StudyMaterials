package org.data.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {
    /** Creates a ServerSocket listening on the given port. */
    public static ServerSocket createServerSocket(int port) throws IOException {
        return new ServerSocket(port);
    }
    /** Accepts a single client connection and returns the Socket. */
    public static Socket acceptClient(ServerSocket server) throws IOException {
        return server.accept();
    }
    /** Creates a Socket and connects to the given host and port. */
    public static Socket connectToServer(String host, int port) throws IOException {
        return new Socket(host, port);
    }
    /** Sends a text message to the server via the socket's output stream. */
    public static void sendMessage(Socket socket, String message) throws IOException {
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(message);
    }
    /** Reads a line of text from the socket's input stream. */
    public static String receiveMessage(Socket socket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        return in.readLine();
    }
    /** Returns the remote address and port as a string. */
    public static String remoteInfo(Socket socket) {
        return socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
    }
    /** Returns the local address and port as a string. */
    public static String localInfo(Socket socket) {
        return socket.getLocalAddress().getHostAddress() + ":" + socket.getLocalPort();
    }
    /** Closes a Socket, ignoring any exception. */
    public static void closeSocket(Socket socket) {
        try {
            if (socket != null) socket.close();
        } catch (IOException ignored) {
        }
    }
    /** Closes a ServerSocket, ignoring any exception. */
    public static void closeServerSocket(ServerSocket server) {
        try {
            if (server != null) server.close();
        } catch (IOException ignored) {
        }
    }
    /**
     * Starts a simple echo server on a separate thread, then a client sends
     * a message and receives the echo. Returns the server's reply.
     */
    public static String echoDemo(int port, String message) throws IOException, InterruptedException {
        // Start echo server in background
        Thread serverThread = new Thread(() -> {
            try (ServerSocket server = new ServerSocket(port)) {
                Socket client = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                String line = in.readLine();
                out.println("ECHO: " + line);
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        serverThread.setDaemon(true);
        serverThread.start();

        // Give server time to start
        Thread.sleep(100);

        // Client
        try (Socket client = new Socket("localhost", port)) {
            sendMessage(client, message);
            return receiveMessage(client);
        }
    }
}
