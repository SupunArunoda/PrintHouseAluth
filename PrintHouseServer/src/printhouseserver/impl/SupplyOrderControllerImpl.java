/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.SupplyOrderController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SupplyOrder;
import model.SupplyOrderDetail;
import printhouseserver.dbaccess.SupplyOrderDBAccess;

/**
 *
 * @author neo
 */
public class SupplyOrderControllerImpl extends UnicastRemoteObject implements SupplyOrderController {

    private SupplyOrderDBAccess supplyOrderDBAccess;
    private SupplyOrderDetailControllerImpl supplyOrderDetailControllerImpl;

    public SupplyOrderControllerImpl() throws RemoteException {
        super();
        supplyOrderDBAccess = new SupplyOrderDBAccess();
        supplyOrderDetailControllerImpl = new SupplyOrderDetailControllerImpl();

    }

    @Override
    public int addSupplyOrder(SupplyOrder supplyOrder) throws RemoteException, SQLException {

        if (supplyOrderDBAccess.addSupplyOrder(supplyOrder) == 1) {
            ArrayList<SupplyOrderDetail> supplyOrderDetailList = supplyOrder.getSupplyOrderList();
            int totalCount = 0;
            for (SupplyOrderDetail supplyOrderDetail : supplyOrderDetailList) {
                if (supplyOrderDetailControllerImpl.addSupplyOrderDetail(supplyOrderDetail) == 1) {
                    totalCount++;
                }
            }
            if (totalCount == supplyOrderDetailList.size()) {
                return 1;
            }
        }
        return 0;

    }

}
