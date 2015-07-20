/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.SQLException;
import model.SupplyOrder;
import printhouseserver.connection.DBConnection;
import printhouseserver.connection.DBHandle;

/**
 *
 * @author neo
 */
public class SupplyOrderDBAccess {

    public int addSupplyOrder(SupplyOrder supplyOrder) throws SQLException {
        String sql = "INSERT INTO supply_order VALUES(" + supplyOrder.getSupplyOrderId() + ",'" + supplyOrder.getDescription() + "'," + supplyOrder.getDate() + "," + supplyOrder.getSupplierId() + ")";
        System.out.println(sql);
        int result = DBHandle.setData(DBConnection.getDBConnection().getConnection(), sql);
        return result;
    }
    
    

}
