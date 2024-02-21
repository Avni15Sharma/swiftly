package com.swiftly.demo.Entity;

import jakarta.persistence.*;

import javax.sound.midi.Sequence;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",length=45)
    private int uid;
    @Column(name="name",length=255)
    private int uname;
    @Column(name="email",length=255)
    private int uemail;
    @Column(name="pass",length=255)
    private int upass;

    public User() {
    }

    public User(int id, int name, int email, int pass) {
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
        return "User{" +
                "id=" + uid +
                ", name=" + uname +
                ", email=" + uemail +
                ", pass=" + upass +
                '}';
    }
}
