/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;

/**
 *
 * @author Buddhi
 */
public interface ItemController extends Remote {

    public ArrayList<Item> getAllItems() throws RemoteException, SQLException;

    public int addItem(Item item) throws RemoteException, SQLException;

}
