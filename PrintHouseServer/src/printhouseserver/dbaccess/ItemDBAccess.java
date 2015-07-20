/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;
import printhouseserver.connection.DBConnection;
import printhouseserver.connection.DBHandle;

/**
 *
 * @author neo
 */
public class ItemDBAccess {

    public ArrayList<Item> getAllItems() throws SQLException {

        String sql = "SELECT * FROM item Order by description";
        ResultSet result = DBHandle.getData(DBConnection.getConnection(), sql);
        ArrayList<Item> itemList = new ArrayList<Item>();
        while (result.next()) {
            int id = result.getInt("item_id");
            String description = result.getString("description");
            String brand = result.getString("brand");
            double quantity = result.getDouble("quantity");
            double price = result.getDouble("price");

            Item item = new Item(id, description, brand, quantity, "GENERAL", price);
            itemList.add(item);
        }
        return itemList;
    }

    public int addItem(Item item) throws SQLException {
        String sql = "INSERT INTO Item VALUES(" + item.getItemId() + ",'" + item.getDescription() + "','" + item.getBrand() + "','" + item.getState() + "'," + item.getQuantity() + "," + item.getPrice() + ")";
        int result = DBHandle.setData(DBConnection.getConnection(), sql);
        return result;
    }

}
