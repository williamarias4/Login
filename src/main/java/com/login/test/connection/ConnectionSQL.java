/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.test.connection;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 *
 * @author willi
 */
public class ConnectionSQL {

    Context context;
    DataSource dataSource;
    
//    public static DataSource getMySQLDataSource() {
//		Properties props = new Properties();
//		FileInputStream fis = null;
//		MysqlDataSource mysqlDS = null;
//		try {
//			fis = new FileInputStream("db.properties");
//			props.load(fis);
//			mysqlDS = new MysqlDataSource();
//			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
//			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
//			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return mysqlDS;
//	}
    

//    public ConnectionSQL() {
//        try {
//            Context context = new InitialContext();
//            DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myDB");
//        } catch (NamingException ex) {
//            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
