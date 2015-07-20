/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.SupplierController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Supplier;
import printhouseserver.dbaccess.SupplierDBAccess;


/**
 *
 * @author Buddhi
 */
public class SupplierControllerImpl extends UnicastRemoteObject implements SupplierController {

    private SupplierDBAccess supplierDBAccess;

    public SupplierControllerImpl() throws RemoteException {
        super();
        supplierDBAccess = new SupplierDBAccess();
    }

    @Override
    public int addSupplier(Supplier supplier) throws RemoteException, SQLException {
        return supplierDBAccess.addSupplier(supplier);
    }

    @Override
    public ArrayList<Supplier> getSupplierList() throws RemoteException, SQLException {
        return supplierDBAccess.getSupplierList();
    }
}
