/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import printhouseserver.impl.RemoteFactoryImpl;

/**
 *
 * @author Buddhi
 */
public class PrintHouseServerStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("PrintHouseServer", new RemoteFactoryImpl());

            System.out.println("Server started!");
        } catch (RemoteException ex) {
            System.out.println("Couldn't start the server... Try again.");
        }
    }

}
