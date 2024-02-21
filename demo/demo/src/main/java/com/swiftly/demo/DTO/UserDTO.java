package com.swiftly.demo.DTO;

import jakarta.persistence.Column;

public class UserDTO {
    private int uid;
    private int uname;
    private int uemail;
    private int upass;

    public UserDTO() {
    }

    public UserDTO(int id, int name, int email, int pass) {
        this.uid = id;
        this.uname = name;
        this.uemail = email;
        this.upass = pass;
    }

    public int getId() {
        return uid;
    }

    public void setId(int id) {
        this.uid = id;
    }

    public int getName() {
        return uname;
    }

    public void setName(int name) {
        this.uname = name;
    }

    public int getEmail() {
        return uemail;
    }

    public void setEmail(int email) {
        this.uemail = email;
    }

    public int getPass() {
        return upass;
    }

    public void setPass(int pass) {
        this.upass = pass;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + uid +
                ", name=" + uname +
                ", email=" + uemail +
                ", pass=" + upass +
                '}';
    }
}

