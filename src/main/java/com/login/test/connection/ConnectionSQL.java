package com.login.test.connection;

import java.io.FileInputStream;
import java.util.Properties;
import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.IOException;

/**
 *
 * @author willi
 */
public class ConnectionSQL {

//    String dbUrl = "jdbc:mysql://localhost:3306/login";
//    String user = "root";
//    String password = "";
    public static DataSource getMySQLDataSource() {
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDS = null;
        try {
            fis = new FileInputStream("src/main/resources/db.properties");
            props.load(fis);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
            mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
            mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mysqlDS;
    }

//    public static DataSource getOracleDataSource() {
//        Properties props = new Properties();
//        FileInputStream fis = null;
//        OracleDataSource oracleDS = null;
//        try {
//            fis = new FileInputStream("db.properties");
//            props.load(fis);
//            oracleDS = new OracleDataSource();
//            oracleDS.setURL(props.getProperty("ORACLE_DB_URL"));
//            oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
//            oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return oracleDS;
//    }
}
