package br.com.noc.sandbox;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class App {

    public static void main (String[] args) {
        Server jettyServer = new Server(8081);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        context.setContextPath("/");
        jettyServer.setHandler(context);

        try {
            System.out.println("Starting server...");
            jettyServer.start();
            System.out.println("Server start.");
            jettyServer.join();
        } catch (Exception e) {
            System.out.println("Ooops, server stopped abruptly.");
            e.printStackTrace();
        }


    }
}
