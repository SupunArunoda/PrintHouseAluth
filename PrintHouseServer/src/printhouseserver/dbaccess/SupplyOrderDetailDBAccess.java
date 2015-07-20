/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.SQLException;
import java.util.ArrayList;
import model.SupplyOrder;
import model.SupplyOrderDetail;
import printhouseserver.connection.DBConnection;
import printhouseserver.connection.DBHandle;

/**
 *
 * @author neo
 */
public class SupplyOrderDetailDBAccess {
    
    public int addSupplyOrderDetail(SupplyOrderDetail supplyOrderDetail) throws SQLException {
        String sql = "INSERT INTO supply_order_detail(supply_order_id,quantity,price,item_id) VALUES ("+supplyOrderDetail.getSupplyOrderId()+","+supplyOrderDetail.getQuantity()+","+supplyOrderDetail.getPrice()+","+supplyOrderDetail.getItemId()+")";
        int result = DBHandle.setData(DBConnection.getDBConnection().getConnection(), sql);
        return result;
    }
    
    
    
}
