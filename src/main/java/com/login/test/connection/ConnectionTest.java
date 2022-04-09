
package com.login.test.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import java.sql.Statement;

/**
 *
 * @author willi
 */
public class ConnectionTest {

    public static void main(String[] args) {

        testConnection();
        System.out.println("**********");

    }

    public static void testConnection() {

        DataSource ds = null;
        ds = ConnectionSQL.getMySQLDataSource();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select username from User");
            while (rs.next()) {
                System.out.println("User Name=" + rs.getString("username"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
