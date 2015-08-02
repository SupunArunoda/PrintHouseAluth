/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Buddhi
 */
public class DBConnection {

    private Connection connection;
    private static DBConnection dBConnection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/printhouse", "root", "");
    }

    private static DBConnection getDBConnection() throws SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public static Connection getConnection() throws SQLException {
        return getDBConnection().connection;
    }
}
