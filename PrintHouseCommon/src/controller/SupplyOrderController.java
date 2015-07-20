/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import model.SupplyOrder;

/**
 *
 * @author neo
 */
public interface SupplyOrderController extends Remote{
    
    public int addSupplyOrder(SupplyOrder supplyOrder) throws RemoteException, SQLException;
    
    
    
}
