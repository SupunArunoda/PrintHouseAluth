/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import java.rmi.RemoteException;
import java.sql.SQLException;
import model.SupplyOrderDetail;
import printhouseserver.dbaccess.SupplyOrderDBAccess;
import printhouseserver.dbaccess.SupplyOrderDetailDBAccess;

/**
 *
 * @author neo
 */
public class SupplyOrderDetailControllerImpl {

    SupplyOrderDetailDBAccess supplyOrderDetailDBAccess;

    public SupplyOrderDetailControllerImpl() throws RemoteException {
        super();
        supplyOrderDetailDBAccess = new SupplyOrderDetailDBAccess();

    }
    
    
    public int addSupplyOrderDetail(SupplyOrderDetail supplyOrderDetail) throws SQLException, RemoteException {
        return supplyOrderDetailDBAccess.addSupplyOrderDetail(supplyOrderDetail);
        
    }

}
