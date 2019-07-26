/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.code;

public class Info_User {
    private int usid;
    private String uname;
    private String upwd;
    private String email;
    private String fname;
    private String address;

    public Info_User() {
    }

    public Info_User(int usid, String uname, String upwd, String email, String fname, String address) {
        this.usid = usid;
        this.uname = uname;
        this.upwd = upwd;
        this.email = email;
        this.fname = fname;
        this.address = address;
    }

    public int getUsid() {
        return usid;
    }

    public void setUsid(int usid) {
        this.usid = usid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}

