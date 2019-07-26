/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.code;

/**
 *
 * @author Dell M4700
 */
public class Login_info {
    private String login_name ;
    private String login_pass;

    public Login_info() {
    }

    public Login_info(String login_name, String login_pass) {
        this.login_name = login_name;
        this.login_pass = login_pass;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_pass() {
        return login_pass;
    }

    public void setLogin_pass(String login_pass) {
        this.login_pass = login_pass;
    }
    
    
}
