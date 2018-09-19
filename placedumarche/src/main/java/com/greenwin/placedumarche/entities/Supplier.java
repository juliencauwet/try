package com.greenwin.placedumarche.entities;

import javax.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

    //Compte - historique vente - compte bancaire


    @ManyToOne
    private Purchase purchase;

    public Supplier(String name, String email, Purchase purchase) {
        this.name = name;
        this.email = email;
        this.purchase = purchase;
    }

    private  Supplier(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
