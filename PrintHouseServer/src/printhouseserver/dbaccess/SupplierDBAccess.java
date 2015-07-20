/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Supplier;
import printhouseserver.connection.DBConnection;
import printhouseserver.connection.DBHandle;

/**
 *
 * @author Buddhi
 */
public class SupplierDBAccess {

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public int addSupplier(Supplier customer) throws SQLException {
        
        
        return 0;
    }

    public ArrayList<Supplier> getSupplierList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            String sql = "SELECT * FROM supplier Order by name";
            ResultSet result = DBHandle.getData(DBConnection.getDBConnection().getConnection(), sql);
            ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
            while (result.next()) {
                int id = result.getInt("supplier_id");
                String name = result.getString("name");
                String address = result.getString("address");
                String telephone = result.getString("telephone");
                String email = result.getString("email");

                Supplier supplier = new Supplier(id, name, address, telephone, email);
                supplierList.add(supplier);
            }
            
            return supplierList;
            
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

}
