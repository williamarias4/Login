/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.test;

/**
 *
 * @author willi
 */
public class User {
    
    private String username;
    private String password;
    private String reset_password_token;
    
    //<editor-fold defaultstate="collapsed" desc="Setters & Getters">

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the reset_password_token
     */
    public String getReset_password_token() {
        return reset_password_token;
    }

    /**
     * @param reset_password_token the reset_password_token to set
     */
    public void setReset_password_token(String reset_password_token) {
        this.reset_password_token = reset_password_token;
    }
    
    //</editor-fold>
    
}
