package com.login.test.logintest;

import com.login.test.connection.ConnectionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginTestApplicationTests {

    @Test
//	void contextLoads() {
//            
//	}
    public static void main(String[] args) {

        testConnection();
        System.out.println("**********");
//        User user = new User("bongo","password123");
//        Dao dao = new UserDao();
//        dao.save(user);
//        List<User> users = new ArrayList<>();
//        users = dao.getAll();
//        UserService service = new UserService();
//        service.login(user);
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
