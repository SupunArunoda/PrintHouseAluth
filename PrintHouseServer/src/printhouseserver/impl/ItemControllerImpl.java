/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import model.Item;
import controller.ItemController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import printhouseserver.dbaccess.ItemDBAccess;

/**
 *
 * @author Buddhi
 */
public class ItemControllerImpl extends UnicastRemoteObject implements ItemController {
    private ItemDBAccess itemDBAccess;
    
    public ItemControllerImpl() throws RemoteException {
        super();
        itemDBAccess = new ItemDBAccess();
    }

    @Override
    public ArrayList<Item> getAllItems() throws RemoteException, SQLException {
        return itemDBAccess.getAllItems();
    }

    @Override
    public int addItem(Item item) throws RemoteException, SQLException{
        return itemDBAccess.addItem(item);
    }
}
