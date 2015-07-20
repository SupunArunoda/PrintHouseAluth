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
import model.Customer;
import model.Supplier;

/**
 *
 * @author neo
 */
public interface SupplierController extends Remote{

    public int addSupplier(Supplier supplier) throws RemoteException, SQLException;

    public ArrayList<Supplier> getSupplierList() throws RemoteException, SQLException;

}
