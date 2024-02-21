package com.swiftly.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",length=45)
    private int id;
    @Column(name="name",length=255)
    private int name;
    @Column(name="email",length=255)
    private String email;
    @Column(name="pass",length=255)
    private String pass;
    @Column(name="address",length=255)
    private String address;

    public Vendor() {
    }

    public Vendor(int id, int name, String email, String pass, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
