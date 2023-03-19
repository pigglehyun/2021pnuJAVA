package com.fm.server;

import com.fm.controller.SearchPlayerController;
import com.fm.server.model.PlayerRepository;
import com.fm.server.model.SearchPlayerModel;
import com.fm.view.SearchPlayerView;
import com.sun.net.httpserver.HttpServer;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;

public class PlayerServer {
    private static final String HOSTNAME = "localhost";
    private static final int PORT = 9000;
    private static final int BACKLOG = 1;

    static {
        PlayerRepository.getInstance().load();
    }

    public static void main(final String... args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(HOSTNAME, PORT), BACKLOG);
        server.createContext("/players", new PlayerHandler());
 //       server.createContext("/quit", new HttpHandler() {
//            @Override
 //           public void handle(HttpExchange exchange) throws IOException {
 //               System.exit(0);
 //           }
//        });
        SwingUtilities.invokeLater(new Runnable() {
            public synchronized void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        server.start();
    }


    public static void createAndShowGUI() throws Exception {
        // Create table model
        SearchPlayerModel model = new SearchPlayerModel();
        // Create controller
        SearchPlayerController controller = new SearchPlayerController(model);
        // Create view
        SearchPlayerView view = new SearchPlayerView(controller, model);
        // Make the window appear
        view.setTitle("FM - Find a Player");
        view.setSize(800, 800);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.pack();
        view.setVisible(true);
    }
}
